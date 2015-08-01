package com.allala.spring.ioc.beans;

import java.util.Date;

public class News {
	private Long id;
	private String headlines;
	private String mainContent;
	private String reporter;
	private Date newsDate;
	
	public News(){
		
	}	

	public News(Long id, String headlines, String mainContent, String reporter,
			Date newsDate) {
		super();
		this.id = id;
		this.headlines = headlines;
		this.mainContent = mainContent;
		this.reporter = reporter;
		this.newsDate = newsDate;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHeadlines() {
		return headlines;
	}

	public void setHeadlines(String headlines) {
		this.headlines = headlines;
	}

	public String getMainContent() {
		return mainContent;
	}

	public void setMainContent(String mainContent) {
		this.mainContent = mainContent;
	}

	public String getReporter() {
		return reporter;
	}

	public void setReporter(String reporter) {
		this.reporter = reporter;
	}

	public Date getNewsDate() {
		return newsDate;
	}

	public void setNewsDate(Date newsDate) {
		this.newsDate = newsDate;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", headlines=" + headlines + ", mainContent="
				+ mainContent + ", reporter=" + reporter + ", newsDate="
				+ newsDate + "]";
	}
	

}
