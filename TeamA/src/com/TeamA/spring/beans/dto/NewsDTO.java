package com.TeamA.spring.beans.dto;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class NewsDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5215230006668128723L;

	
	private Date newsTime;
	
	private Long location;
	
	private String localNews;

	/**
	 * @param newsTime
	 * @param location
	 * @param localNews
	 */
	public NewsDTO(Date newsTime, Long location, String localNews) {
		super();
		this.newsTime = newsTime;
		this.location = location;
		this.localNews = localNews;
	}

	public Date getNewsTime() {
		return newsTime;
	}

	public void setNewsTime(Date newsTime) {
		this.newsTime = newsTime;
	}

	public Long getLocation() {
		return location;
	}

	public void setLocation(Long location) {
		this.location = location;
	}

	public String getLocalNews() {
		return localNews;
	}

	public void setLocalNews(String localNews) {
		this.localNews = localNews;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
