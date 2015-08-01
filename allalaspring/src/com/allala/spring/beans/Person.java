package com.allala.spring.beans;

public class Person {
	
	private String fname;
	private String lname;
	private int empid;

	
	public Person(String fname, String lname, int empid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.empid=empid;
	}
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}


	
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
	
	

}
