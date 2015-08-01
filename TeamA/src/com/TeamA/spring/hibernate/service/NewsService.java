package com.TeamA.spring.hibernate.service;

import java.util.List;

import com.TeamA.spring.hibernate.entities.News;

public interface NewsService {
	public List<News> getNewsByLocation(Long location);
	public List<News> getNewsById(Long id);
	public List<News> getAllNews();
	
}
