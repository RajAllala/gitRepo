package com.project.spring.hibernate.DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.project.spring.hibernate.DAO.User_RegistrationDAO;

public class User_RegistrationDAOImpl implements User_RegistrationDAO{

	private SessionFactory sessionFactory;
	Session session=null;
	
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public String emailById(Long id) {
		Session session= sessionFactory.getCurrentSession();
		String query="Select email_id from docxchange_new_user_registration where id=:id";
		String emailId= session.createQuery(query).toString();
	
		session.close();
		sessionFactory.close();
		return emailId;
	}

	public void sendMailIdAndHash(Long id, String registration_hash_code) {
		// TODO Auto-generated method stub
		System.out.println(emailById(1L));
		//String email= emailById(1L);
		//String hash="this_is_the_registration_hash_code"; 
		
	}
	


	
	
	
}
