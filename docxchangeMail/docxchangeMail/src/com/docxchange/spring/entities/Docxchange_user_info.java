package com.docxchange.spring.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Docxchange_user_info implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6873902983304190935L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="email_id")
	private String email_id;
	
	private String first_name;
	
	private String last_name;
	private String job_title;
	
	private String organization;
	  
	private int noofemployees;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String country;
	private Long zipcode;
	private Long user_type_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public int getNoofemployees() {
		return noofemployees;
	}
	public void setNoofemployees(int noofemployees) {
		this.noofemployees = noofemployees;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Long getZipcode() {
		return zipcode;
	}
	public void setZipcode(Long zipcode) {
		this.zipcode = zipcode;
	}
	public Long getUser_type_id() {
		return user_type_id;
	}
	public void setUser_type_id(Long user_type_id) {
		this.user_type_id = user_type_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Docxchange_user_info() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Docxchange_user_info(String email_id, String first_name,
			String last_name, String job_title, String organization,
			int noofemployees, String address1, String address2, String city,
			String state, String country, Long zipcode, Long user_type_id) {
		super();
		this.email_id = email_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.job_title = job_title;
		this.organization = organization;
		this.noofemployees = noofemployees;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.user_type_id = user_type_id;
	}

}
