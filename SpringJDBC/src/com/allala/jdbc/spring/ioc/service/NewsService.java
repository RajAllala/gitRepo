package com.allala.jdbc.spring.ioc.service;

import java.util.List;

import com.allala.jdbc.spring.beans.News;

public interface NewsService {
	
	public News fetchNewsById(Long id);
	public void createNews(News news);
	public List<News> getEveryNews();
	public void deleteNews(Long id);
	public void modifyNews(News news);

}
