package com.mailengine.entities;

import java.io.Serializable;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="docxchange_user")
public class Docxchange_user implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -993671930014620824L;

	
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)	 
	  private String user_email;
	  
	  @Column(name="password")
	  private String password;
	  
	  @Column(name="enabled")
	  private Boolean enabled;

	  @Column(name="created_by")
	  private String created_by;
	
	@Column(name="updated_by")
	  private String updated_by;
	
	@Column(name="created_date")	
	  private Date created_date;
	
	@Column(name="updated_date")
	  private Date updated_date;

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Docxchange_user() {
		
	}

	public Docxchange_user(String user_email, String password, Boolean enabled,
			String created_by, String updated_by, Date created_date,
			Date updated_date) {
		super();
		this.user_email = user_email;
		this.password = password;
		this.enabled = enabled;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "docxchange_user [user_email=" + user_email + ", password="
				+ password + ", enabled=" + enabled + ", created_by="
				+ created_by + ", updated_by=" + updated_by + ", created_date="
				+ created_date + ", updated_date=" + updated_date + "]";
	}
	
	  
}
