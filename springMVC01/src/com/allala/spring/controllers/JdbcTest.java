package com.allala.spring.controllers;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate4.HibernateTemplate;

public class JdbcTest {

	private Long id;
	private String name;
	private int age;
	
	@Autowired
	private JdbcTemplate jTemplate;
	
	public void setjTemplate(JdbcTemplate jTemplate) {
		this.jTemplate = jTemplate;
	}
	
	private HibernateTemplate hTemplate;
	
	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public JdbcTest(String name, int age, Long id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public JdbcTest(){
		
	}

	public List<JdbcTest> getAlldata(){
		String sqlQuery = "select * from jdbcTest";
		return jTemplate.query(sqlQuery, new TestRowMapper());
	}
	
	public JdbcTest getPersonById(){
		String sqlQuery = "SELECT * FROM jdbctest where id=2 ";
		return jTemplate.queryForObject(sqlQuery, new TestRowMapper());
	}
	
	class TestRowMapper implements RowMapper<JdbcTest>{

		@Override
		public JdbcTest mapRow(ResultSet arg0, int arg1) throws SQLException {
			JdbcTest jt = new JdbcTest(arg0.getString(2),arg0.getInt(3),arg0.getLong(1));
			return jt;
		}
	}	
}
