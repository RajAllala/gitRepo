package com.allala.Service.Impl;

import java.util.List;

import com.allala.DAO.UserDAO;
import com.allala.Service.UserServiceDAO;
import com.allala.entities.News;
import com.allala.entities.User;

public class UserServiceImpl implements UserServiceDAO {

	private UserDAO userDAO;
	


	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return userDAO.getUserById(id);
	}

	@Override
	public List<News> getAllNewsByUser(Long id) {
		// TODO Auto-generated method stub
		return userDAO.getAllNewsByUser(id);
	}

}
