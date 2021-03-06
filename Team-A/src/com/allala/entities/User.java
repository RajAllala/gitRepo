package com.allala.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="auth")
@NamedQuery(name="getUserById", query="from User where id=:id")
@NamedNativeQuery(name="nativeUserById", query="Select * from AUTH where id = :id",resultClass=User.class)
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8431784432616742848L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="user",cascade=CascadeType.ALL)
	private List<News> listNews;

	public User() {
		super();
		
	}

	public User(String name, String email, String password, List<News> listNews) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.listNews = listNews;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public List<News> getListNews() {
		return listNews;
	}

	public void setListNews(List<News> listNews) {
		this.listNews = listNews;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password="
				+ password + ", listNews=" + listNews + "]";
	}




}
