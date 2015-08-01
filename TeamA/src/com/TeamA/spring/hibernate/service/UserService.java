package com.TeamA.spring.hibernate.service;

import com.TeamA.spring.hibernate.entities.User;

public interface UserService {
	public void persistUser(User u);
	public User getUserById(Long id);

}
