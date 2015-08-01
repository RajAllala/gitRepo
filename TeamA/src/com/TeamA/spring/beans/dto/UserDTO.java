package com.TeamA.spring.beans.dto;

import java.io.Serializable;


public class UserDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5775460419056390018L;

	private String name;
	
	private String email;
	
	private String password;

	/**
	 * @param name
	 * @param email
	 * @param password
	 */
	public UserDTO(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
}
