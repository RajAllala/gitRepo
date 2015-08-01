package com.allala.spring.ioc.service.impl;

import java.util.List;

import com.allala.spring.ioc.beans.News;
import com.allala.spring.ioc.dao.NewsDAO;
import com.allala.spring.ioc.service.GenericService;

public class GenericServiceImpl implements GenericService {

private NewsDAO newsDAO;

	public void setNewsDAO(NewsDAO newsDAO) {
	this.newsDAO = newsDAO;
}

	@Override
	public List<News> getEveryNews() {
		System.out.println("HELLO");
		return newsDAO.getAllNews();
	}

	@Override
	public News getSpecificNewsById() {
		return newsDAO.getNewsById(2L);
	}

	@Override
	public News getExceptionalNews() {
		try {
			return (News) newsDAO.getCrazyNews();
		} catch (Exception e) {
			//e.printStackTrace();
		}
		return null;
	}

}
