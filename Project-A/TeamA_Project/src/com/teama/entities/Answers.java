package com.teama.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;



@Entity
@Table(name="answers")
public class Answers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -653524930858459166L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Lob
	@Column(name="answertext")
	@Type(type="org.hibernate.type.TextType")
	private String answerText;
	
	private String username;
	
	Long questions_id;
	
	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getQuestions_id() {
		return questions_id;
	}

	public void setQuestions_id(Long questions_id) {
		this.questions_id = questions_id;
	}

	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public Answers(String answerText, String username, Long questions_id) {
		super();
		this.answerText = answerText;
		this.username = username;
		this.questions_id = questions_id;
	}
	
	
	
	

}
