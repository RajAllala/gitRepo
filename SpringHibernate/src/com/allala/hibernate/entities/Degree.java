package com.allala.hibernate.entities;

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
import javax.persistence.Table;

@Entity
@Table(name="DEGREE")
public class Degree implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1729200191218016975L;
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
	
	public Degree(){
		
	}

	public Degree(Long id, String degreeName, String university,
			String yearPassedOut, String major, String minor, Person person) {
		super();
		this.id = id;
		this.degreeName = degreeName;
		this.university = university;
		this.yearPassedOut = yearPassedOut;
		this.major = major;
		this.minor = minor;
		this.person = person;
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
	

	public Degree(String degreeName, String university, String yearPassedOut,
			String major, String minor, Person person) {
		super();
		this.degreeName = degreeName;
		this.university = university;
		this.yearPassedOut = yearPassedOut;
		this.major = major;
		this.minor = minor;
		this.person = person;
	}

	@Override
	public String toString() {
		return "Degree [degreeName=" + degreeName + ", university="
				+ university + ", yearPassedOut=" + yearPassedOut + ", major="
				+ major + ", minor=" + minor + ", person=" + person + "]";
	}
	
	
	
}
