package com.allala.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedNativeQueries;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")

@NamedNativeQueries({
	@NamedNativeQuery(name="nativeUserById", query="Select * from users where username = :username",resultClass=Users.class),
	@NamedNativeQuery(name="nativeUserNewsById", query="Select * from NEWS where username = :username",resultClass=News.class),
	@NamedNativeQuery(name="nativeNewsByLoc", query="Select * from NEWS where location=:location",resultClass=News.class),
	@NamedNativeQuery(name="nativeZips", query="Select location from NEWS"),
	@NamedNativeQuery(name="nativeUsers", query="Select username from users")
	

})
public class Users implements Serializable{
	

	private static final long serialVersionUID = -1453327069826478263L;
	@Id
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	private boolean enabled;
	private String email;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Users() {
		super();
		// TODO Auto-generated constructor stub
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

	public Users(String username) {
		super();
		this.username = username;
	}
	public Users(String username, String password, boolean enabled, String email) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.email = email;
	}	

}
