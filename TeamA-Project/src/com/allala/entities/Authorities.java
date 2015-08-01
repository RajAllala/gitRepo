package com.allala.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="authorities")
public class Authorities implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6660673821617453730L;
	@Id
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
	public Authorities(String username, String authority) {
		super();
		this.username = username;
		this.authority = authority;
	}
	public Authorities() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
