package com.allala.jdbc.spring.ioc.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.allala.jdbc.spring.beans.News;

public class NewsRowMapper implements RowMapper<News> {
	
	@Override
	public News mapRow(ResultSet arg0, int arg1) throws SQLException {
		News news = new News(arg0.getLong(1),arg0.getString(2),arg0.getString(3),arg0.getString(4));
		return news;
	}
}
