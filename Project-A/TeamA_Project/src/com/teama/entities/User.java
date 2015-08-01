package com.teama.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;




@Entity
@Table(name="users")
@NamedNativeQueries(value = { @NamedNativeQuery(name = "test_user", query = "select * from users where username=:username", resultClass=User.class) })
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2364932438287666490L;
	
	  
	@Id
	private String username;
	
	private String password;
	
	private boolean enabled;
	
	
	/*@OneToOne(fetch = FetchType.LAZY,mappedBy="user",cascade=CascadeType.ALL )
	private User_info user_Info;*/
	
	
	public String getUsername() {
		return username;
	}
	public User(String username, String password, boolean enabled) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUser_email() {
		return username;
	}
	public void setUser_email(String user_email) {
		this.username = user_email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
