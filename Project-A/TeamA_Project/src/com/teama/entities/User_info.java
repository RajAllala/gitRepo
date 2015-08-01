package com.teama.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="user_info")


@NamedNativeQueries({
	@NamedNativeQuery(name="getProfile", query="Select * from user_info where username = :username",resultClass=User_info.class),
	@NamedNativeQuery(name="getusertype", query="Select tech_type from user_info where username = :username"),
	@NamedNativeQuery(name="getTechTypeUsers", query="Select * from user_info where tech_type = :tech_type and username in(select username from authorities where authority='ROLE_STUDENT')",resultClass=User_info.class),
	@NamedNativeQuery(name="getallusers", query="Select * from user_info",resultClass=User_info.class),
	@NamedNativeQuery(name="getTrainerDocs", query="Select * from Docs_student where usertype =:usertype",resultClass=Docs_student.class)
})

public class User_info implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4368831806194378851L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String first_name;
	private String last_name;

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
	private String username;
	
	/*@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="username")
	private User user;*/
	
	
/*	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}*/
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
/*	public String getEmail_id() {
		return username;
	}
	public void setEmail_id(String email_id) {
		this.username = email_id;
	}*/
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User_info [id=" + id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", country="
				+ country + ", zip=" + zip + ", phone_number=" + phone_number
				+ ", visa_status=" + visa_status + ", university=" + university
				+ ", degree=" + degree + ", dob=" + dob + ", tech_type="
				+ tech_type + ", user=" + username + "]";
	}
	
	
	
	
	
	

}
