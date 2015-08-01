package com.TeamA.spring.hibernate.dao;

import com.TeamA.spring.hibernate.entities.User;

public interface UserDAO {
	
	public void persistUser(User u);
	public User getUserById(Long id);

}
