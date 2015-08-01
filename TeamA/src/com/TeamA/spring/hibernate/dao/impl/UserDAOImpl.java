package com.TeamA.spring.hibernate.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.TeamA.spring.hibernate.dao.UserDAO;
import com.TeamA.spring.hibernate.entities.User;

public class UserDAOImpl implements UserDAO {
	
	SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void persistUser(User u) {
		Session s = sessionFactory.openSession();
		System.out.println("HERE");
		s.saveOrUpdate(u);
		s.close();
	}

	@Override
	public User getUserById(Long id) {

		Session s = sessionFactory.openSession();
		return (User) s.getNamedQuery("userById");
		
		
		

	}

}
