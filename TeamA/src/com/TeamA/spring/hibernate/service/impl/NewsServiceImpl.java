package com.TeamA.spring.hibernate.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TeamA.spring.hibernate.dao.NewsDAO;
import com.TeamA.spring.hibernate.entities.News;
import com.TeamA.spring.hibernate.service.NewsService;
@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDAO newsDAO;
	
	public NewsDAO getNewsDAO() {
		return newsDAO;
	}

	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}

	@Override
	public List<News> getNewsByLocation(Long location) {
		// TODO Auto-generated method stub
		return newsDAO.getNewsByLocation(location);
	}

	@Override
	public List<News> getNewsById(Long id) {
		return newsDAO.getNewsById(id);
	}


	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return newsDAO.getAllNews();
	}

}
