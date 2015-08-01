package com.allala.DAO;

import java.util.List;

import com.allala.entities.News;

public interface NewsDAO {
	
	public List<News> getAllNews();
	public List<News> getNewsByloc(Long zip);
	public void persistnews(News news);
	public List<Long> getAllzips(); 
}
