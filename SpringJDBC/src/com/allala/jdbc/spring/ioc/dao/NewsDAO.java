package com.allala.jdbc.spring.ioc.dao;

import java.util.List;
import com.allala.jdbc.spring.beans.News;

public interface NewsDAO{
	public News getNewsById(Long id);
	public void addNews(News news);
	public List<News> getAllNews();
	public void removeNews(Long id);
	public void updateNews(News news);
}
