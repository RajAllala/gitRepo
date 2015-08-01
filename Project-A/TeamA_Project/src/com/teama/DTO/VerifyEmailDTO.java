package com.teama.DTO;

import java.io.Serializable;

public class VerifyEmailDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7544726500495168287L;
	
	
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
	
	

}
