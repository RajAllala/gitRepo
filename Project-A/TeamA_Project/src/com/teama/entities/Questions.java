package com.teama.entities;

import java.io.Serializable;
import java.util.List;

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
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Type;














@Entity
@Table(name="questions")
@NamedNativeQueries(value = { @NamedNativeQuery(name = "test_q", query = "select * from questions where username=:username", resultClass=Questions.class),
		@NamedNativeQuery(name="questions", query="select * from questions where id=:q_id",resultClass=Questions.class),
		@NamedNativeQuery(name="userquestions", query="select * from questions where username=:username",resultClass=Questions.class),
		@NamedNativeQuery(name="getuser", query= "select * from users where username=:username",resultClass=User.class),
		@NamedNativeQuery(name="getansquestion", query="select * from answers  where questions_id=:q_id",resultClass=Answers.class),
		@NamedNativeQuery(name="unansquestions", query="select * from questions where id not in (select questions_id from answers)",resultClass=Questions.class),
		@NamedNativeQuery(name="allansquestions", query="select * from questions where id in (select questions_id from answers)",resultClass=Questions.class),
		@NamedNativeQuery(name="trainerquestions", query="select * from questions where username in (select username from user_info where tech_type=:tech_type)",resultClass=Questions.class),
		
		})
public class Questions implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8046798218073968556L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Lob
	@Column(name="questiontext")
	@Type(type="org.hibernate.type.TextType")
	private String questionText;
	
	private String username;
	
	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Questions(String questionText, String username) {
		super();
		this.questionText = questionText;
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestionText() {
		return questionText;
	}
	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}
	
	
	

}
