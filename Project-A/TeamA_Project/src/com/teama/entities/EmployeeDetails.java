package com.teama.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="employee_details")
@NamedNativeQuery(name="empuserinfo", query="select * from user_info where username in (select user_email from employee_details)",resultClass=User_info.class)
public class EmployeeDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3117923218246590220L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String user_email;
	
	private String client_name;
	private String client_address;
	private String city;
	private String state;
	private String country;
	private String zip;
	private String workphone;
	private Date lcupdate_date;
	private Date visa_start_date;
	private Date visa_end_date;
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDetails(Long id, String user_email, String client_name,
			String client_address, String city, String state, String country,
			String zip, String workphone, Date lcupdate_date,
			Date visa_start_date, Date visa_end_date) {
		super();
		this.id = id;
		this.user_email = user_email;
		this.client_name = client_name;
		this.client_address = client_address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
		this.workphone = workphone;
		this.lcupdate_date = lcupdate_date;
		this.visa_start_date = visa_start_date;
		this.visa_end_date = visa_end_date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getClient_address() {
		return client_address;
	}
	public void setClient_address(String client_address) {
		this.client_address = client_address;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getWorkphone() {
		return workphone;
	}
	public void setWorkphone(String workphone) {
		this.workphone = workphone;
	}
	public Date getLcupdate_date() {
		return lcupdate_date;
	}
	public void setLcupdate_date(Date lcupdate_date) {
		this.lcupdate_date = lcupdate_date;
	}
	public Date getVisa_start_date() {
		return visa_start_date;
	}
	public void setVisa_start_date(Date visa_start_date) {
		this.visa_start_date = visa_start_date;
	}
	public Date getVisa_end_date() {
		return visa_end_date;
	}
	public void setVisa_end_date(Date visa_end_date) {
		this.visa_end_date = visa_end_date;
	}
	
	
	
	
	

}
