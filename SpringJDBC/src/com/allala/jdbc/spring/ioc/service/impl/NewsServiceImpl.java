package com.allala.jdbc.spring.ioc.service.impl;

import java.util.List;

import com.allala.jdbc.spring.beans.News;
import com.allala.jdbc.spring.ioc.dao.NewsDAO;
import com.allala.jdbc.spring.ioc.service.NewsService;

public class NewsServiceImpl implements NewsService {
	private NewsDAO newsDAO;

	@Override
	public News fetchNewsById(Long id) {
		
		return newsDAO.getNewsById(id);
	}

	@Override
	public void createNews(News news) {
		// TODO Auto-generated method stub
		newsDAO.addNews(news);
	}

	@Override
	public List<News> getEveryNews() {
		// TODO Auto-generated method stub
		return newsDAO.getAllNews();
	}

	@Override
	public void deleteNews(Long id) {
		// TODO Auto-generated method stub
		newsDAO.removeNews(id);
		

	}

	@Override
	public void modifyNews(News news) {
		newsDAO.updateNews(news);
	}

	
	public NewsDAO getNewsDAO() {
		return newsDAO;
	}

	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}
	
	

}
