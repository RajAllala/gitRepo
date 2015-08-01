package com.project.spring.hibernate.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="docxchange_new_user_registration")
public class docxchange_new_user_registration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 845918782975310844L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name="email_id")
	  private String email_id;
	
	@Column(name="first_name")
	  private String first_name;
	
	@Column(name="last_name")
	  private String last_name;
	
	@Column(name="job_title")
	  private String job_title;
	
	@Column(name="user_type_id")
	  private String user_type_id;
	
	@Column(name="organization")
	  private String organization;
	
	@Column(name="noofemployees")
	  private String noofemployees;
	
	@Column(name="address1")
	  private String address1;
	
	@Column(name="address2")
	  private String address2;
	
	@Column(name="phone_number")
	  private String phone_number;
	
	@Column(name="city")
	  private String city;
	
	@Column(name="state")
	  private String state;
	
	@Column(name="country")
	  private String country;
	
	@Column(name="zipcode")
	  private String zipcode;
	 
	@Column(name="email_sent_date")
	private Date email_sent_date;
	 
	@Column(name="registration_hash_code")
	private String registration_hash_code;
	 
	@Column(name="registration_success_date")
	private Date registration_success_date;
	  
	@Column(name="email_sent_count")
	private int email_sent_count ;

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

	public String getUser_type_id() {
		return user_type_id;
	}

	public void setUser_type_id(String user_type_id) {
		this.user_type_id = user_type_id;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getNoofemployees() {
		return noofemployees;
	}

	public void setNoofemployees(String noofemployees) {
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

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Date getEmail_sent_date() {
		return email_sent_date;
	}

	public void setEmail_sent_date(Date email_sent_date) {
		this.email_sent_date = email_sent_date;
	}

	public String getRegistration_hash_code() {
		return registration_hash_code;
	}

	public void setRegistration_hash_code(String registration_hash_code) {
		this.registration_hash_code = registration_hash_code;
	}

	public Date getRegistration_success_date() {
		return registration_success_date;
	}

	public void setRegistration_success_date(Date registration_success_date) {
		this.registration_success_date = registration_success_date;
	}

	public int getEmail_sent_count() {
		return email_sent_count;
	}

	public void setEmail_sent_count(int email_sent_count) {
		this.email_sent_count = email_sent_count;
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

	public docxchange_new_user_registration() {
		
	}

	public docxchange_new_user_registration(Long id, String email_id,
			String first_name, String last_name, String job_title,
			String user_type_id, String organization, String noofemployees,
			String address1, String address2, String phone_number, String city,
			String state, String country, String zipcode, Date email_sent_date,
			String registration_hash_code, Date registration_success_date,
			int email_sent_count, String created_by, String updated_by,
			Date created_date, Date updated_date) {
		super();
		this.id = id;
		this.email_id = email_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.job_title = job_title;
		this.user_type_id = user_type_id;
		this.organization = organization;
		this.noofemployees = noofemployees;
		this.address1 = address1;
		this.address2 = address2;
		this.phone_number = phone_number;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.email_sent_date = email_sent_date;
		this.registration_hash_code = registration_hash_code;
		this.registration_success_date = registration_success_date;
		this.email_sent_count = email_sent_count;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "docxchange_new_user_registration [id=" + id + ", email_id="
				+ email_id + ", first_name=" + first_name + ", last_name="
				+ last_name + ", job_title=" + job_title + ", user_type_id="
				+ user_type_id + ", organization=" + organization
				+ ", noofemployees=" + noofemployees + ", address1=" + address1
				+ ", address2=" + address2 + ", phone_number=" + phone_number
				+ ", city=" + city + ", state=" + state + ", country="
				+ country + ", zipcode=" + zipcode + ", email_sent_date="
				+ email_sent_date + ", registration_hash_code="
				+ registration_hash_code + ", registration_success_date="
				+ registration_success_date + ", email_sent_count="
				+ email_sent_count + ", created_by=" + created_by
				+ ", updated_by=" + updated_by + ", created_date="
				+ created_date + ", updated_date=" + updated_date + "]";
	}
	
	
}
