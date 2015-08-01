package com.allala.spring.ioc.service;

import java.util.List;

import com.allala.spring.ioc.beans.News;

public interface GenericService {
	public List<News> getEveryNews();
	public News getSpecificNewsById();
	public News getExceptionalNews();

}
