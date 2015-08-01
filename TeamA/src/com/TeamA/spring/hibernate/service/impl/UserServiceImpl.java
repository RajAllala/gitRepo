package com.TeamA.spring.hibernate.service.impl;

import com.TeamA.spring.hibernate.dao.UserDAO;
import com.TeamA.spring.hibernate.entities.User;
import com.TeamA.spring.hibernate.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public void persistUser(User u) {
		// TODO Auto-generated method stub
		userDAO.persistUser(u);
		
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userDAO.getUserById(id);
	}

}
