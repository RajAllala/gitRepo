package com.allala.custom.function;

import java.sql.Connection;
import java.sql.Statement;

import javax.sql.DataSource;


public class MyCustomFuction {
	
	private DataSource dataSource;
	private String userName;
	private String password;
	private String emailid;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public void myCustomBigFunction(){
		
		try{
			System.out.println("I am The myCustomBigFunction called to do a specific operation");
			Class.forName("org.postgresql.Driver");
			Connection con = dataSource.getConnection();
			Statement st = con.createStatement();
			
			String sql = "INSERT INTO PERSON(id,username,password,email)"
					+"VALUES("+System.currentTimeMillis()+",'"+getUserName()+"','"+getPassword()+"','"+getEmailid()+"')";
			
			st.executeUpdate(sql);
			System.out.println("Iam doing my custom Job");
		
		}catch(Exception ex){
			ex.printStackTrace();
			
		}

	}
	
	public void printMyMessage(String message){
		System.out.println("#######################");
		System.out.println("######          #######");
		System.out.println("######"  +message+  "#######");
		System.out.println("######          #######");
		System.out.println("#######################");
	}
	
	public void  printMyInfo() {
		System.out.println("MyCustomFuction [dataSource=" + dataSource + ", userName="
				+ userName + ", password=" + password + ", emailid=" + emailid
				+ "]");
	}
	
	
	

}
