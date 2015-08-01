package com.teama.DTO;

import java.io.Serializable;
import java.util.Date;

public class New_User_DTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4528875329339435925L;
	
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
	private String dob;
	private String tech_type;
	private String md5hash;

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
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
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
	public New_User_DTO(String email_id, String first_name, String last_name,
			String password, String address, String city, String state,
			String country, Long zip, String phone_number, String visa_status,
			String university, String degree, String dob, String tech_type,
			String md5hash) {
		super();
		this.email_id = email_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
		this.phone_number = phone_number;
		this.visa_status = visa_status;
		this.university = university;
		this.degree = degree;
		this.dob = dob;
		this.tech_type = tech_type;
		this.md5hash = md5hash;
	}
	
	
	@Override
	public String toString() {
		return "New_User_DTO [email_id=" + email_id + ", first_name="
				+ first_name + ", last_name=" + last_name + ", password="
				+ password + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", zip=" + zip
				+ ", phone_number=" + phone_number + ", visa_status="
				+ visa_status + ", university=" + university + ", degree="
				+ degree + ", dob=" + dob + ", tech_type=" + tech_type
				+ ", md5hash=" + md5hash + "]";
	}
	public New_User_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
