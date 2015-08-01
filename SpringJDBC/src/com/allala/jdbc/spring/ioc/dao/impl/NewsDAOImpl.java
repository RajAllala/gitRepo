package com.allala.jdbc.spring.ioc.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.allala.jdbc.spring.beans.News;
import com.allala.jdbc.spring.ioc.dao.NewsDAO;

public class NewsDAOImpl implements NewsDAO {

	private DataSource datasource; 
	
	@Override
	public News getNewsById(Long id) {
		
		return null;
	}

	@Override
	public void addNews(News news) {
		Connection con = null;
		Statement st;
		try {
			st = con.createStatement();
			Long id = System.currentTimeMillis();
			String insertScript = "INSERT INTO News(ID,HEADLINES,MAINCONTENT,REPORTER) VALUES ("+id+",'Google','google main content','Allala')";
		            		
		    st.executeUpdate(insertScript);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@Override
	public List<News> getAllNews() {
		
		final String sqlQuery="SELECT * FROM NEWS";
		List<News> result = new ArrayList<News>();
		Connection con = null;
		
		try{
			
			con = datasource.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sqlQuery);
			
			while(rs.next()){
				News n = new News(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getString(4));
				result.add(n);
			}
			
			rs.close();
			st.close();
			con.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		finally{
			try{
				if(null!=con)
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public void removeNews(Long id) {
		
	}

	@Override
	public void updateNews(News news) {
		
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

}
