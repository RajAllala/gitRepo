package com.allala.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class News implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 729659969335419388L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long news_id;
	@Column(name="location")
	private Long zip;
	@Column(name="datetime")
	private Date date;
	@Column(name="news")
	private String data;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private User user;
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Long getNews_id() {
		return news_id;
	}
	public void setNews_id(Long news_id) {
		this.news_id = news_id;
	}
	public Long getZip() {
		return zip;
	}
	public void setZip(Long zip) {
		this.zip = zip;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
	public News(Long zip, Date date, String data, User user) {
		super();
		this.zip = zip;
		this.date = date;
		this.data = data;
		this.user = user;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "News [zip=" + zip + ", date=" + date + ", data=" + data
				+ ", user=" + user + "]";
	}
	
	
	
	

}
