package com.allala.DAO;

import java.util.List;

import com.allala.entities.News;
import com.allala.entities.User;

public interface UserDAO {

	public User getUserById(Long id);
	public List<News> getAllNewsByUser(Long id);
}
