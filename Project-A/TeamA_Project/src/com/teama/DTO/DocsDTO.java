package com.teama.DTO;

import java.util.Date;

public class DocsDTO {
	Long id;
	private String user_email;
	private byte[] doc;
	private String doc_name;
	private Date uploded_date;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public byte[] getDoc() {
		return doc;
	}
	public void setDoc(byte[] doc) {
		this.doc = doc;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public Date getUploded_date() {
		return uploded_date;
	}
	public void setUploded_date(Date uploded_date) {
		this.uploded_date = uploded_date;
	}
	
}
