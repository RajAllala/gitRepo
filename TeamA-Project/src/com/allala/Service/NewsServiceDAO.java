package com.allala.Service;

import java.util.List;

import com.allala.DTO.NewsDTO;
import com.allala.entities.News;

public interface NewsServiceDAO {
	public List<News> getAllNews();
	public List<News> getNewsByloc(Long zip);
	void addNews(NewsDTO newsDTO, String username);
	public List<Long> getAllzips(); 
}