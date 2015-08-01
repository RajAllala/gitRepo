package com.allala.jdbc.spring.ioc.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.allala.jdbc.spring.beans.News;
import com.allala.jdbc.spring.ioc.dao.NewsDAO;
import com.allala.jdbc.spring.ioc.dao.mapper.NewsRowMapper;

public class NewsDAO2Impl implements NewsDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public News getNewsById(Long id) {
		final String queryById = "Select * from news where id = ?";
		return jdbcTemplate.queryForObject(queryById, new Object[]{id},new NewsRowMapper());
	}

	@Override
	public void addNews(News news) {
		final String insertScript = "INSERT INTO News(ID,HEADLINES,MAINCONTENT,REPORTER) VALUES (?,?,?,?)";
		jdbcTemplate.update(insertScript,new Object[]{news.getId(),news.getHeadlines(),news.getMaincontent(),news.getReporter()});

	}

	@Override
	public List<News> getAllNews() {
		final String sqlQuery = "Select * from News";	
		return jdbcTemplate.query(sqlQuery,new NewsRowMapper());
	}

	@Override
	public void removeNews(Long id) {
		final String deleteQuery="Delete from news where id=?";
		//jdbcTemplate.update(deleteQuery,new Object[]{id});
		jdbcTemplate.update(deleteQuery, Long.valueOf(id));

	}

	@Override
	public void updateNews(News news) {
		final String updateQuery="Update news Set id=?, headlines=?,maincontent=?,reporter=? where id=?";
		jdbcTemplate.update(updateQuery,new Object[]{news.getId(),news.getHeadlines(),news.getMaincontent(),news.getReporter(),news.getId()});

	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
