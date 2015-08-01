package com.TeamA.spring.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.TeamA.spring.hibernate.dao.NewsDAO;
import com.TeamA.spring.hibernate.entities.News;

@Repository
public class NewsDAOImpl implements NewsDAO {
	
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<News> getNewsByLocation(Long location) {
		// TODO Auto-generated method stub
		//return (List<News>) hTemplate.findByNamedQueryAndNamedParam("getNewsByLoc", "location", location);
		Session s = sessionFactory.openSession();
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<News> getNewsById(Long id) {
		// TODO Auto-generated method stub
		
		//return (List<News>) hTemplate.findByNamedQueryAndNamedParam("getNewsById", "id", id);
		return null;
	}

	@Override
	public void setNews() {
		// TODO Auto-generated method stub

	}

	@Override
	public void persistUser() {
		// TODO Auto-generated method stub
		
	}

	public HibernateTemplate gethTemplate() {
		return null;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		//this.hTemplate = hTemplate;
	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return null;
	}

}
