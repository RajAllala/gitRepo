package com.allala.jdbc.plaint.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PlainJDBCTest {
	public static void main(String[] args){
		
		final String url="jdbc:postgresql://192.168.1.68:5432/bellinfodevdb";
		final String username="dbuser";
		final String password = "dbpassword";
		
		// Step1: make a connection
		Connection connection = null;
		
		// Make use of vendor specified database driver

			try {
				Class.forName("org.postgresql.Driver");
				// Get the connection object from driver manager
				connection = DriverManager.getConnection(url,username,password);
				//create statement
				Statement st = connection.createStatement();
				//what do i want to query
				String sqlQuery = "SELECT * FROM News";
				
				//now execute sql query by using statement object then return to resultSet
				ResultSet rs = st.executeQuery(sqlQuery);
				
				while(rs.next()){
					System.out.println(rs.getLong(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
				}
				
				//i am some but still have to close the object rs,statement,connection
				//we have to clean up the environment
				rs.close();
				System.out.println("Insert Queries: ");
				Long id = System.currentTimeMillis();
				String insertScript = "INSERT INTO News(ID,HEADLINES,MAINCONTENT,REPORTER) VALUES ("+id+",'Google','google main content','Allala')";
			            		
			    st.executeUpdate(insertScript);
				st.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			finally{
				try{
					connection.close();
				}catch(SQLException e){
					e.printStackTrace();
				}
			}
		
		
}} 