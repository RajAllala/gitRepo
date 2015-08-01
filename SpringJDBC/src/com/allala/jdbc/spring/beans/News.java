package com.allala.jdbc.spring.beans;

public class News {

	private Long id;
	private String headlines;
	private String maincontent;
	private String reporter;
	
	public News(){
		
	}
	
	public News(Long id, String headlines, String maincontent, String reporter) {
		super();
		this.id = id;
		this.headlines = headlines;
		this.maincontent = maincontent;
		this.reporter = reporter;
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
	public String getMaincontent() {
		return maincontent;
	}
	public void setMaincontent(String maincontent) {
		this.maincontent = maincontent;
	}
	public String getReporter() {
		return reporter;
	}
	public void setReporter(String reporter) {
		this.reporter = reporter;
	}
}
