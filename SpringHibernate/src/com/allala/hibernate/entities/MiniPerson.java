package com.allala.hibernate.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class MiniPerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7533491573700457575L;
	@Id
	private String firstName;
	private String lastName;
	
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
	
	public MiniPerson(){
		
	}
	public MiniPerson(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "MiniPerson [firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}
	

}
