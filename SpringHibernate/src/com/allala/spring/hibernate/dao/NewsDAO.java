package com.allala.spring.hibernate.dao;

import java.util.List;

import com.allala.hibernate.entities.News;

public interface NewsDAO {
	
	public void saveOrUpdateNews(News news);
	public List<News> getAllNews();
	public News getNewsById(Long id);
	public void deleteNews(News news);
	
	public void myCustomBigFunction();
	public void printMyMessage(String message);
	public void printMyInfo();
	

}
