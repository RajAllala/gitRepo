package com.teama.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="Docs_employee")
@NamedNativeQueries(value = { @NamedNativeQuery(name = "test_emp", query = "select * from Docs_employee where id=:id") })

public class Docs_employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2970986584998534992L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	private String user_email;
	private byte[] doc;
	private String doc_name;
	private Date uploded_date;
	private Long size;
	private String content_type;
	
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	private String usertype;
	
	
	
	public long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public Docs_employee(Long id, String user_email, byte[] doc,
			String doc_name, Date uploded_date, Long size, String content_type,
			String usertype) {
		super();
		this.id = id;
		this.user_email = user_email;
		this.doc = doc;
		this.doc_name = doc_name;
		this.uploded_date = uploded_date;
		this.size = size;
		this.content_type = content_type;
		this.usertype = usertype;
	}
	public Docs_employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
