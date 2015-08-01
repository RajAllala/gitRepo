package com.allala.spring.hibernate.service.impl;

import java.util.List;

import com.allala.hibernate.entities.News;
import com.allala.spring.hibernate.dao.NewsDAO;
import com.allala.spring.hibernate.service.NewsService;

public class NewsServiceImpl implements NewsService {
	
	private NewsDAO newsDAO;

	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}

	@Override
	public void saveOrUpdateNews(News news) {
		// TODO Auto-generated method stub
		newsDAO.saveOrUpdateNews(news);
		
	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return newsDAO.getAllNews();
	}

	@Override
	public News getNewsById(Long id) {
		// TODO Auto-generated method stub
		return newsDAO.getNewsById(id);
	}

	@Override
	public void deleteNews(News news) {
		// TODO Auto-generated method stub
		newsDAO.deleteNews(news);
		
	}

	@Override
	public void myCustomBigFunction() {
		// TODO Auto-generated method stub
		newsDAO.myCustomBigFunction();
		
	}

	@Override
	public void printMyMessage(String message) {
		// TODO Auto-generated method stub
		newsDAO.printMyMessage(message);
	}

	@Override
	public void printMyInfo() {
		// TODO Auto-generated method stub
		newsDAO.printMyInfo();
	}

}
