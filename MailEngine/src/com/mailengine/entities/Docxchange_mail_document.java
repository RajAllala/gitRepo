package com.mailengine.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 
@Entity
@Table(name="docxchange_mail_document")
public class Docxchange_mail_document implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -832452904746151355L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private Long id;
	 
	@Column(name="document_id") 
	private Long  document_id;
	
	@Column(name="mail_document_status_id") 
	private int  mail_document_status_id;
	 
	@Column(name="mail_document_exception") 
	private String mail_document_exception;
	
	@Column(name="mail_from_user_email") 
	private String mail_from_user_email;
	  
	@Column(name="mail_user_sent_date")  
	private Date mail_user_sent_date;
	  
	@Column(name="mail_document_hashcode") 
	private String mail_document_hashcode;
	  
	@Column(name="created_by")
	  private String created_by;
	  
	@Column(name="updated_by")
	  private String updated_by;
	  
	@Column(name="created_date")
	  private Date created_date;
	  
	@Column(name="updated_date")
	  private Date updated_date;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDocument_id() {
		return document_id;
	}

	public void setDocument_id(Long document_id) {
		this.document_id = document_id;
	}

	public int getMail_document_status_id() {
		return mail_document_status_id;
	}

	public void setMail_document_status_id(int mail_document_status_id) {
		this.mail_document_status_id = mail_document_status_id;
	}

	public String getMail_document_exception() {
		return mail_document_exception;
	}

	public void setMail_document_exception(String mail_document_exception) {
		this.mail_document_exception = mail_document_exception;
	}

	public String getMail_from_user_email() {
		return mail_from_user_email;
	}

	public void setMail_from_user_email(String mail_from_user_email) {
		this.mail_from_user_email = mail_from_user_email;
	}

	public Date getMail_user_sent_date() {
		return mail_user_sent_date;
	}

	public void setMail_user_sent_date(java.util.Date date) {
		this.mail_user_sent_date = date;
	}

	public String getMail_document_hashcode() {
		return mail_document_hashcode;
	}

	public void setMail_document_hashcode(String mail_document_hashcode) {
		this.mail_document_hashcode = mail_document_hashcode;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public Date getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Docxchange_mail_document() {
		
	}

	public Docxchange_mail_document(Long mail_id, Long id, Long document_id,
			int mail_document_status_id, String mail_document_exception,
			String mail_from_user_email, Date mail_user_sent_date,
			String mail_document_hashcode, String created_by,
			String updated_by, Date created_date, Date updated_date) {
		super();
		this.id = id;
		this.document_id = document_id;
		this.mail_document_status_id = mail_document_status_id;
		this.mail_document_exception = mail_document_exception;
		this.mail_from_user_email = mail_from_user_email;
		this.mail_user_sent_date = mail_user_sent_date;
		this.mail_document_hashcode = mail_document_hashcode;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "docxchange_mail_document [id=" + id + ", document_id="
				+ document_id + ", mail_document_status_id="
				+ mail_document_status_id + ", mail_document_exception="
				+ mail_document_exception + ", mail_from_user_email="
				+ mail_from_user_email + ", mail_user_sent_date="
				+ mail_user_sent_date + ", mail_document_hashcode="
				+ mail_document_hashcode + ", created_by=" + created_by
				+ ", updated_by=" + updated_by + ", created_date="
				+ created_date + ", updated_date=" + updated_date + "]";
	}

}
