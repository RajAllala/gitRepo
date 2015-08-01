package com.allala.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.allala.DAO.NewsDAO;
import com.allala.entities.News;

@Repository
public class NewsDAOImpl implements NewsDAO {

	
	@Autowired
	HibernateTemplate hTemplate;
	
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return hTemplate.loadAll(News.class);
	}

	@Override
	public List<News> getNewsByloc(Long zip) {
		// TODO Auto-generated method stub
		return (List<News>) hTemplate.findByNamedQueryAndNamedParam("nativeNewsByLoc", "location", zip);
	}

	@Override
	public void persistnews(News news) {
		// TODO Auto-generated method stub
		hTemplate.saveOrUpdate(news);
	}

	@Override
	public List<Long> getAllzips() {
		// TODO Auto-generated method stub
		return (List<Long>) hTemplate.getSessionFactory().openSession().getNamedQuery("nativeZips");
		
	}


}
