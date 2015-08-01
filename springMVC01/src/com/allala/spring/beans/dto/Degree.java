package com.allala.spring.beans.dto;

import java.io.Serializable;

public class Degree implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3385969167909785696L;	
	private String degreeName;	
	private String university;	
	private String yearPassedOut;	
	private String major;	
	private String minor;
	
	private String firstName;
	private String lastName;
	private Long personId;

	
	public Degree() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Degree(String degreeName, String university,
			String yearPassedOut, String major, String minor) {
		super();
		
		this.degreeName = degreeName;
		this.university = university;
		this.yearPassedOut = yearPassedOut;
		this.major = major;
		this.minor = minor;
		
	}


	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
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


	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getYearPassedOut() {
		return yearPassedOut;
	}

	public void setYearPassedOut(String yearPassedOut) {
		this.yearPassedOut = yearPassedOut;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMinor() {
		return minor;
	}

	public void setMinor(String minor) {
		this.minor = minor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
