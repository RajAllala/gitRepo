package com.allala.spring.controllers.service;

import java.sql.Date;
import java.util.List;

import com.allala.spring.hibernate.entities.News;

public interface NewsService {
	
	public List<News> getAllNews();
	public List<News> getNewsBySymbol(String symbol);
	public List<News> getAllNewsOnADate(Date date);
	public News getNewsForSymbolOnADate(String symbol, Date date);
	
}