package com.allala.DTO;

import java.io.Serializable;

public class UsersDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6366414861195599792L;
	private String username;
	private String password;
	private String email;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UsersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UsersDTO(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public UsersDTO(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	
	
	
}
