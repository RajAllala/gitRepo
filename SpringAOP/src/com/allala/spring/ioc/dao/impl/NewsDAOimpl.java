package com.allala.spring.ioc.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.allala.spring.ioc.beans.News;
import com.allala.spring.ioc.dao.NewsDAO;

public class NewsDAOimpl implements NewsDAO {

	@Override
	public News getNewsById(Long id) {
		return new News(id,"Apple releases Iwatch","Apple stock fell because of no innovative products",
				"Allala",new Date());
	}

	@Override
	public List<News> getAllNews() {
		List<News> result = new ArrayList<News>();
		result.add(new News(1L,"Apple releases Iwatch","Apple stock fell because of no innovative products",
				"Allala",new Date()));
		result.add(new News(2L,"Netflix releases 4k stream","Apple stock fell because of no innovative products",
				"Nerella",new Date()));
		result.add(new News(3L,"Samsung releases andriod watch","Apple stock fell because of no innovative products",
				"Adama",new Date()));
		result.add(new News(4L,"Microsoft releases Windows 8 pro","MS stock Rises because of its products",
				"RaviTeja",new Date()));
		
		return result;
	}

	@Override
	public List<News> getCrazyNews() throws Exception {
		throw new Exception("Crazy Exception");
	}

	
}
