package com.TeamA.spring.hibernate.entities;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USER")
@NamedNativeQuery(name="userById", query="Select * from user where id = :id",resultClass=User.class)
public class User implements Serializable {

	private static final long serialVersionUID = -8332244216078081755L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Password")
	private String password;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="user",cascade=CascadeType.ALL)
	private List<News> news;

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

	public List<News> getNews() {
		return news;
	}

	public void setNews(List<News> news) {
		this.news = news;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, String email, String password, List<News> news) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.news = news;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password="
				+ password + ", news=" + news + "]";
	}
	
	
}
