package com.allala.Service.Impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.allala.DAO.UsersDAO;
import com.allala.DTO.NewsDTO;
import com.allala.DTO.UsersDTO;
import com.allala.Service.UserServiceDAO;
import com.allala.entities.News;
import com.allala.entities.Users;


@Transactional
@Service

public class UserServiceImpl implements UserServiceDAO {
	@Autowired
	private UsersDAO userDAO;
	


	public UsersDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UsersDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public Users getUserByName(String username) {
		// TODO Auto-generated method stub
		return userDAO.getUserByName(username);
	}

	@Override
	public List<News> getAllNewsByUser(String username) {
		// TODO Auto-generated method stub
		return userDAO.getAllNewsByUser(username);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void persistUsersDTO(UsersDTO user) {
		// TODO Auto-generated method stub
		Users u = new Users(user.getUsername(),user.getPassword(),true,user.getEmail());
		userDAO.persistUsersDTO(u);
		
	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return userDAO.getAllNews();
	}

	@Override
	public List<News> getNewsByloc(Long loc) {
		// TODO Auto-generated method stub
		return userDAO.getNewsByloc(loc);
	}

	@Override
	public void persistNews(NewsDTO newsDTO, String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<String> getAllUserNames() {
		// TODO Auto-generated method stub
		return userDAO.getAllUserNames();
	}

	

}
