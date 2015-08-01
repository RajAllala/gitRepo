package com.teama.DAO.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teama.DAO.DocumentDAO;
import com.teama.entities.Docs_employee;
import com.teama.entities.Docs_student;
import com.teama.entities.User_info;

@Repository
public class DocumentDAOImpl implements DocumentDAO {

	
	@Autowired
	private HibernateTemplate hTemplate;
	
	@Override
	@Transactional
	public String PersistDocument(String uploaded_by, byte[] data,
			String doc_name, String content_type, Long size, String usertype) {
		// TODO Auto-generated method stub
		
		Docs_student docs_student = new Docs_student();
		
		docs_student.setDoc_name(doc_name);
		docs_student.setDoc(data);
		docs_student.setUser_email(uploaded_by);
		docs_student.setContent_type(content_type);
		docs_student.setSize(size);
		docs_student.setUsertype(usertype);
		docs_student.setUploded_date(new java.util.Date(System.currentTimeMillis()));
		
		
		hTemplate.save(docs_student);
		return null;
	}

	@Override
	public List<Docs_student> getallDocs() {
		// TODO Auto-generated method stub
		return hTemplate.loadAll(Docs_student.class);
	}

	@Override
	public Docs_student getDocById(Long id) {
		// TODO Auto-generated method stub
		return (Docs_student) hTemplate.getSessionFactory().getCurrentSession().load(Docs_student.class, id);
		
	}

	@Override
	public List<Docs_employee> getallempDocs() {
		// TODO Auto-generated method stub
		return hTemplate.loadAll(Docs_employee.class);
	}

	@Override
	public Docs_employee getempDocById(Long id) {
		// TODO Auto-generated method stub
		return (Docs_employee) hTemplate.getSessionFactory().getCurrentSession().load(Docs_employee.class, id);
	}

	@Override
	public List<Docs_student> getdocs(String usertype) {
		// TODO Auto-generated method stub
		return (List<Docs_student>) hTemplate.findByNamedQueryAndNamedParam("getTrainerDocs", "usertype", usertype);
	}

}
