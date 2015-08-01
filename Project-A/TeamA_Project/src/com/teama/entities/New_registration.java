package com.teama.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
@Entity
@Table(name="new_user_registration")
@NamedNativeQueries(value = { @NamedNativeQuery(name = "test_new", query = "select * from new_user_registration where id=:id") })
public class New_registration implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5451804170200859174L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String email_id;
	private String first_name;
	private String last_name;
	private String password;
	private String address;
	private String city;
	private String state;
	private String country;
	private Long zip;
	private String phone_number;
	private String visa_status;
	private String university;
	private String degree;
	private Date dob;
	private String tech_type;
	private String md5hash;
	
	public New_registration() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getVisa_status() {
		return visa_status;
	}

	public void setVisa_status(String visa_status) {
		this.visa_status = visa_status;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getTech_type() {
		return tech_type;
	}

	public void setTech_type(String tech_type) {
		this.tech_type = tech_type;
	}

	public String getMd5hash() {
		return md5hash;
	}

	public void setMd5hash(String md5hash) {
		this.md5hash = md5hash;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	  

}
