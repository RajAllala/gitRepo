package com.allala.Service.Impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.allala.DAO.NewsDAO;
import com.allala.DTO.NewsDTO;
import com.allala.Service.NewsServiceDAO;
import com.allala.entities.News;
@Service
@Transactional
public class NewsService implements NewsServiceDAO {

	@Autowired
	NewsDAO newsDAO;
	
	
	public NewsDAO getNewsDAO() {
		return newsDAO;
	}

	public void setNewsDAO(NewsDAO newsDAO) {
		this.newsDAO = newsDAO;
	}

	@Override
	public List<News> getAllNews() {
		
		return newsDAO.getAllNews();
	}

	@Override
	public List<News> getNewsByloc(Long zip) {
		
		return newsDAO.getNewsByloc(zip);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void addNews(NewsDTO newsDTO,String username) {
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date utilDate = new java.util.Date();
	    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		News news= new News(newsDTO.getLocation(),sqlDate,newsDTO.getData(),username);
		System.out.println(news);
		newsDAO.persistnews(news);;
		System.out.println("hello");
				
	}

	@Override
	public List<Long> getAllzips() {
		// TODO Auto-generated method stub
		return newsDAO.getAllzips();
	}



}
