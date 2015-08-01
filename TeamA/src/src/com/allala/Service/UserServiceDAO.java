package com.allala.Service;

import java.util.List;


import com.allala.entities.News;

public interface UserServiceDAO {
	public com.allala.entities.User getUserById(Long id);
	public List<News> getAllNewsByUser(Long id);
}
