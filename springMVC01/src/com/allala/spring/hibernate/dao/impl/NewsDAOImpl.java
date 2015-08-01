package com.allala.spring.hibernate.dao.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.allala.spring.hibernate.dao.NewsDAO;
import com.allala.spring.hibernate.entities.News;

@Repository
public class NewsDAOImpl implements NewsDAO {
	
	@Autowired
	HibernateTemplate hTemplate;
	
	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return hTemplate.loadAll(News.class);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<News> getNewsBySymbol(String symbol) {
		// TODO Auto-generated method stub
		return (List<News>) hTemplate.findByNamedQueryAndNamedParam("newsBySymbol", "symbol", symbol);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<News> getAllNewsOnADate(Date date) {
		return (List<News>) hTemplate.findByNamedQueryAndNamedParam("newsByDate", "newsTime", date);
	}

	@Override
	public News getNewsForSymbolOnADate(String symbol, Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
