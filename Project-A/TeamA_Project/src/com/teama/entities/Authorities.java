package com.teama.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="authorities")
public class Authorities implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3248261491606583130L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
	private String username;
	private String authority;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_role() {
		return authority;
	}
	public void setUser_role(String user_role) {
		this.authority = user_role;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Authorities(String username, String user_role) {
		super();
		this.username = username;
		this.authority = user_role;
	}
	public Authorities() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
