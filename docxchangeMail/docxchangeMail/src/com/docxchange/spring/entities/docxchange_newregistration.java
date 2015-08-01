package com.docxchange.spring.entities;

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
public class docxchange_newregistration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 845918782975310844L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name="first_name")
	  private String firstname;
	
	@Column(name="last_name")
	  private String lastname;
	
	@Column(name="password")
	  private String password;
	
	@Column(name="email_id")
	  private String email;
	
	@Column(name="address1")
	  private String address1;
	
	@Column(name="address2")
	  private String address2;
	
	@Column(name="city")
	  private String city;
	
	@Column(name="state")
	  private String state;
	
	@Column(name="country")
	  private String country;
	
	@Column(name="zipcode")
	  private Long zipcode;
	
	@Column(name="noofemployees")
	  private Long no_of_employee;
	
	@Column(name="job_title")
	  private String job_title;
	
	@Column(name="phone_number")
	  private String phone_number;
	
	/*@Column(name="user_type")
	  private String user_type;*/
	
	@Column(name="created_by")
	  private String created_by;
	
	@Column(name="updated_by")
	  private String updated_by;
	
	@Column(name="created_date")	
	  private Date created_date;
	
	@Column(name="updated_date")
	  private Date updated_date;
	
	/*@Column(name="user_reg_password")
	private String user_reg_password;
	 
	@Column(name="user_reg_status")
	private String user_reg_status;*/
	 
	@Column(name="email_sent_date")
	private Date user_reg_email_date;
	 
	@Column(name="registration_hash_code")
	private String reg_md5_hashcode;
	 
	@Column(name="registration_success_date")
	private Date reg_success_date;
	  
	@Column(name="email_sent_count")
	private int reg_email_count;
	@Column(name="user_type_id")
	  private Long user_type_id;
	  @Column(name="registration_status_id")
	  private Long registration_status_id;
	  @Column(name="organization")
	  private String organization;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Long getNo_of_employee() {
		return no_of_employee;
	}

	public void setNo_of_employee(Long no_of_employee) {
		this.no_of_employee = no_of_employee;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
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

	public Date getUser_reg_email_date() {
		return user_reg_email_date;
	}

	public void setUser_reg_email_date(Date user_reg_email_date) {
		this.user_reg_email_date = user_reg_email_date;
	}

	public String getReg_md5_hashcode() {
		return reg_md5_hashcode;
	}

	public void setReg_md5_hashcode(String reg_md5_hashcode) {
		this.reg_md5_hashcode = reg_md5_hashcode;
	}

	public Date getReg_success_date() {
		return reg_success_date;
	}

	public void setReg_success_date(Date reg_success_date) {
		this.reg_success_date = reg_success_date;
	}

	public int getReg_email_count() {
		return reg_email_count;
	}

	public void setReg_email_count(int reg_email_count) {
		this.reg_email_count = reg_email_count;
	}



	public Long getUser_type_id() {
		return user_type_id;
	}

	public void setUser_type_id(Long user_type_id) {
		this.user_type_id = user_type_id;
	}

	public Long getRegistration_status_id() {
		return registration_status_id;
	}

	public void setRegistration_status_id(Long registration_status_id) {
		this.registration_status_id = registration_status_id;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public docxchange_newregistration(Long id, String firstname,
			String lastname, String password,String email, String address1, String address2,
			String city, String state, String country, Long zipcode,
			Long no_of_employee, String job_title, String phone_number,
			 String created_by, String updated_by,
			Date created_date, Date updated_date, Date user_reg_email_date,
			String reg_md5_hashcode, Date reg_success_date,
			int reg_email_count, Long user_type_id, Long registration_status_id,
			String organization) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.no_of_employee = no_of_employee;
		this.job_title = job_title;
		this.phone_number = phone_number;
		/*this.user_type = user_type;*/
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.created_date = created_date;
		this.updated_date = updated_date;
		this.user_reg_email_date = user_reg_email_date;
		this.reg_md5_hashcode = reg_md5_hashcode;
		this.reg_success_date = reg_success_date;
		this.reg_email_count = reg_email_count;
		this.user_type_id = user_type_id;
		this.registration_status_id = registration_status_id;
		this.organization = organization;
	}

	public docxchange_newregistration(String firstname, String lastname,
			String email, String address1, String address2, String city,
			String state, String country, Long zipcode, Long no_of_employee,
			String job_title, String phone_number, Long user_type_id,
			Long registration_status_id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.no_of_employee = no_of_employee;
		this.job_title = job_title;
		this.phone_number = phone_number;
		this.user_type_id = user_type_id;
		this.registration_status_id = registration_status_id;
	}
	

	public docxchange_newregistration(String firstname, String lastname,
			String password, String email, String address1, String address2,
			String city, String state, String country, Long zipcode,
			Long no_of_employee, String job_title, String phone_number,
			Long user_type_id, Long registration_status_id) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.email = email;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.no_of_employee = no_of_employee;
		this.job_title = job_title;
		this.phone_number = phone_number;
		this.user_type_id = user_type_id;
		this.registration_status_id = registration_status_id;
	}

	
	
	
}
