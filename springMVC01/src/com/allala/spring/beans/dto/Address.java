package com.allala.spring.beans.dto;
import java.io.Serializable;

public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6478399777898698488L;
	
	private String address1;	
	private String address2;	
	private String city;	
	private String country;	
	private String zipcode;
	
	private String firstName;
	private String lastName;
	private Long personId;

	
	
	public Address(String address1, String address2, String city,
			String country, String zipcode, String firstName, String lastName,
			Long personId) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.personId = personId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String address1, String address2, String city,
			String country, String zipcode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.country = country;
		this.zipcode = zipcode;
	}

	

}
