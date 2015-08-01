package com.TeamA.spring.hibernate.dao;

import java.util.List;

import com.TeamA.spring.hibernate.entities.News;

public interface NewsDAO {
	
	
	public List<News> getNewsByLocation(Long location);
	public List<News> getNewsById(Long id);
	public List<News> getAllNews();
	public void setNews();
	public void persistUser();
	
	

}
