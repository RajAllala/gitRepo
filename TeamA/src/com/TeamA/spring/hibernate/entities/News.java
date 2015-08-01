package com.TeamA.spring.hibernate.entities; 

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
/*@NamedQueries({
	@NamedQuery(name="getAllNews", query="from News"),
//	@NamedQuery(name="getNewsById", query="from News where id=:user_id")
})*/
@Table(name="NEWS")
public class News implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6717449080528832941L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="DateAndTime")
	private Date newsTime;
	
	@Column(name="Location")
	private Long location;
	
	@Lob
	@Type(type="org.hibernate.type.TextType")
	@Column(name="news")
	private String localNews;


	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="USER_ID")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getNewsTime() {
		return newsTime;
	}

	public void setNewsTime(Date newsTime) {
		this.newsTime = newsTime;
	}

	public Long getLocation() {
		return location;
	}

	public void setLocation(Long location) {
		this.location = location;
	}

	public String getLocalNews() {
		return localNews;
	}

	public void setLocalNews(String localNews) {
		this.localNews = localNews;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News(Date newsTime, Long location, String localNews, User user) {
		super();
		this.newsTime = newsTime;
		this.location = location;
		this.localNews = localNews;
		this.user = user;
	}

	@Override
	public String toString() {
		return "News [newsTime=" + newsTime + ", location=" + location
				+ ", localNews=" + localNews + ", user=" + user + "]";
	}
	
}
