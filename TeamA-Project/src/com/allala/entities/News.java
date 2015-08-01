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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="NEWS")


public class News implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 729659969335419388L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="location")
	private Long zip;
	
	@Column(name="datetime")
	private Date date;
	
	@Column(name="news")
	private String data;
	
	@Column(name="username")
	private String username;
	
	
	public News(Long zip, Date date, String data, String username) {
		super();
		this.zip = zip;
		this.date = date;
		this.data = data;
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public News(Long zip, Date date, String data) {
		super();
		this.zip = zip;
		this.date = date;
		this.data = data;
	}

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "News [zip=" + zip + ", date=" + date + ", data=" + data
				+ "]";
	}
	
}
