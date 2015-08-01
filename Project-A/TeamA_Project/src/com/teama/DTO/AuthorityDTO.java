package com.teama.DTO;

import java.io.Serializable;

public class AuthorityDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8747936030095900584L;
	
	private String username;
	private String authority;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public AuthorityDTO(String username, String authority) {
		super();
		this.username = username;
		this.authority = authority;
	}
	public AuthorityDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
