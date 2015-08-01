package com.allala.spring.controllers.service.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allala.spring.controllers.service.NewsService;
import com.allala.spring.hibernate.dao.NewsDAO;
import com.allala.spring.hibernate.entities.News;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsDAO newsDAO;
	
	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return newsDAO.getAllNews();
		
	}

	@Override
	public List<News> getNewsBySymbol(String symbol) {
		// TODO Auto-generated method stub
		return newsDAO.getNewsBySymbol(symbol);
	}

	@Override
	public List<News> getAllNewsOnADate(Date date) {
		// TODO Auto-generated method stub
		return newsDAO.getAllNewsOnADate(date);
	}

	@Override
	public News getNewsForSymbolOnADate(String symbol, Date date) {
		// TODO Auto-generated method stub
		return newsDAO.getNewsForSymbolOnADate(symbol, date);
	}

}
