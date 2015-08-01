package com.allala.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="NEWS")
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class News implements java.io.Serializable{
	
	private static final long serialVersionUID = 2639863437663971160L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="headlines")
	private String headlines;
	
	@Column(name="maincontent")
	private String maincontent;
	
	@Column(name="reporter")
	private String reporter;
	
	public News() {
		super();
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

	@Override
	public String toString() {
		return "News [id=" + id + ", headlines=" + headlines + ", maincontent="
				+ maincontent + ", reporter=" + reporter + "]";
	}	
	
}
