package com.allala.simpleSoap.ws.beans;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -836255127186350265L;
	private String fname;
	private String lname;
	private Long empid;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public Person(String fname, String lname, Long empid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.empid = empid;
	}
	public Long getEmpid() {
		return empid;
	}
	public void setEmpid(Long empid) {
		this.empid = empid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", empid="
				+ empid + "]";
	}
	
	
	
}
