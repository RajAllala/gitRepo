 package com.mailengine.DAO.Impl;
 
import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mailengine.DAO.DocumentDAO;
import com.mailengine.entities.Document;
import com.mailengine.entities.Document_Info;
import com.mailengine.entities.Docxchange_mail_document;
@Transactional
@Repository
public class DocumentDAOImpl implements DocumentDAO{
		
	@Autowired
	private HibernateTemplate hTemplate;
	private Document doc = new Document();


	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void persistDocument(byte[] b, String filename, String uploaded_by,
			Date uploaded_date, String ext, int size) {
		
		Document_Info doc_info = new Document_Info();
		
		doc.setFileData(b);
		
		doc_info.setFile_uploaded_by(uploaded_by.substring((uploaded_by.indexOf("<")+1), uploaded_by.indexOf(">")));
		doc_info.setFile_uploaded_date(uploaded_date);
		doc_info.setFile_content_type(ext);
		doc_info.setSize(size);
		doc_info.setFile_name(filename);
		
		doc.setDocument_Info(doc_info);
		doc_info.setDocument(doc);
		
		Session session = hTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(doc);
		session.getTransaction().commit();
		session.close();		
		
		pushDataTomailDB(doc_info);
		goIndex(doc.getId().toString());
		
	}

	@Override
	public void persistDoc(byte[] b, Document_Info doc_info) {
		
	}

	@Override
	public void goIndex(String id) {
		
		
		HttpClient httpClient = new DefaultHttpClient();
	    try {
	      HttpGet httpGetRequest = new HttpGet("http://192.168.1.141:8094/docxchange/mail/"+id);
	      HttpResponse httpResponse = httpClient.execute(httpGetRequest);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void pushDataTomailDB(Document_Info doc_info) {
		Docxchange_mail_document  mail_doc = new Docxchange_mail_document();
		
		mail_doc.setDocument_id(doc_info.getDocument().getId());
		mail_doc.setMail_from_user_email(doc_info.getFile_uploaded_by());
		System.out.println(doc_info.getFile_uploaded_by());
		mail_doc.setMail_user_sent_date(doc_info.getFile_uploaded_date());
		
		Session session = hTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(mail_doc);
		session.getTransaction().commit();
		session.close();		
		
	}

	@Override
	public boolean verifyUser(String email) {
		
		String user_email;
		
		try{
		user_email = hTemplate.getSessionFactory().getCurrentSession().createSQLQuery("select user_email from docxchange_user where user_email=\'"+email+"\'").uniqueResult().toString();
		}
		catch(Exception e){
			System.out.println("No User Found");
			return false;
			}
		
		if(user_email != null)
			return true;
		else
			return false;
		
	}
	
	
	

}
