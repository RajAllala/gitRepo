package com.allala.DTO;

import java.io.Serializable;
import java.sql.Date;

public class NewsDTO implements Serializable {

	private static final long serialVersionUID = -3093009410804059922L;
	
	private String data;
	private Long location;
	private Date datetime;
	private String username;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Long getLocation() {
		return location;
	}
	public void setLocation(Long location) {
		this.location = location;
	}
	public Date getDatetime() {
		return datetime;
	}
	public void setDatetime(Date datetime) {
		this.datetime = datetime;
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
	public NewsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsDTO(String data, Long location, Date datetime, String username) {
		super();
		this.data = data;
		this.location = location;
		this.datetime = datetime;
		this.username = username;
	}
	
	

}
