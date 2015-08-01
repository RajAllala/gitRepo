package com.allala.hibernate.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="PERSON")
@NamedQueries({
	@NamedQuery(name="personById", query="from Person where id=:p_id"),
	@NamedQuery(name="personByLastName", query="from Person where lastName=:p_lastname")
})

@NamedNativeQueries({
	@NamedNativeQuery(name="nativePersonById", query="Select * from person where id = :p_id",resultClass=Person.class),
	@NamedNativeQuery(name="nativeFirstNameById", query="select firstname from person where id= :p_id"),
	@NamedNativeQuery(name="nativePartialPersonDetails", query="select firstname,lastname from person where id=:p_id",resultClass=MiniPerson.class)
})

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5264397547859613594L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="phonenumber")
	private String phoneNumber;
	
	@Transient
	private String something;
	
	
	public String getSomething() {
		return something;
	}

	public void setSomething(String something) {
		this.something = something;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="person",cascade=CascadeType.ALL)
	private Set<Address> addresses;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="person",cascade=CascadeType.ALL)
	private Set<Degree> degrees;
	
	public Person(){
		
	}
	
	public Person(Long id, String firstName, String lastName, String email,
			String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

		
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Set<Degree> getDegrees() {
		return degrees;
	}

	public void setDegrees(Set<Degree> degrees) {
		this.degrees = degrees;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}
}
