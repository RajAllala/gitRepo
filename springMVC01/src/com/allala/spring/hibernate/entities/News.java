package com.allala.spring.hibernate.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Type;



@Entity
@NamedQueries({
	@NamedQuery(name="newsBySymbol", query="from News where symbol=:symbol"),
	@NamedQuery(name="newsByDate", query="from News where news_time=:newsTime"),
	//@NamedQuery(name="personByLastName", query="from Person where lastName=:p_lastname")
})
public class News implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4277192044459770543L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="symbol")
	private String symbol;
	
	@Lob
	@Column(name="headlines")
	@Type(type="org.hibernate.type.TextType")
	private String headlines;
	
	@Lob
	@Column(name="main_story")
	@Type(type="org.hibernate.type.TextType")
	private String mainstory;
	
	@Column(name="source")
	private String source;
	
	@Column(name="source_time")
	private String sourceTime;
	
	@Column(name="news_time")
	private Date newsTime;
	
	@Column(name="time_entry")
	private Timestamp timeEntry;
	
	@Column(name="maincontent")
	private String mainContent;
	
	@Column(name="reporter")
	private String reporter;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getHeadlines() {
		return headlines;
	}
	public void setHeadlines(String headlines) {
		this.headlines = headlines;
	}
	public String getMainstory() {
		return mainstory;
	}
	public void setMainstory(String mainstory) {
		this.mainstory = mainstory;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSourceTime() {
		return sourceTime;
	}
	public void setSourceTime(String sourceTime) {
		this.sourceTime = sourceTime;
	}
	public Date getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(Date newsTime) {
		this.newsTime = newsTime;
	}
	public Timestamp getTimeEntry() {
		return timeEntry;
	}
	public void setTimeEntry(Timestamp timeEntry) {
		this.timeEntry = timeEntry;
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
	
	
	

}
