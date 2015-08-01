package com.allala.spring.hibernate.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Degree implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1381573342732257537L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="degreename")
	private String degreeName;
	@Column(name="university")
	private String university;
	@Column(name="yearpassedout")
	private String yearPassedOut;
	@Column(name="major")
	private String major;
	@Column(name="minor")
	private String minor;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="PERSON_ID")
	private Person person;

	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Degree [degreeName=" + degreeName + ", university="
				+ university + ", yearPassedOut=" + yearPassedOut + ", major="
				+ major + ", minor=" + minor + ", person=" + person + "]";
	}
	
	
	
}
