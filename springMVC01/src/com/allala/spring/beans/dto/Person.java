package com.allala.spring.beans.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5895828747550213993L;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String phonenumber;
	
	
	public Person(){
		
	}
	
	private List<Address> address;
	private List<Degree> degree;

	public Person(String firstName, String lastName, String email,
			String phonenumber, List<Address> address, List<Degree> degree) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phonenumber = phonenumber;
		this.address = address;
		this.degree = degree;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
