package com.allala;

import java.util.Date;

public class Mail {
	
	private String from;
	private String subject;
	private String emailid;
	private Date date;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Mail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Mail(String from, String subject, String emailid, Date date) {
		super();
		this.from = from;
		this.subject = subject;
		this.emailid = emailid;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Mail [from=" + from + ", subject=" + subject + ", emailid="
				+ emailid + ", date=" + date + "]";
	}
	
}
