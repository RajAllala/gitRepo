package com.allala.DAO;

import java.util.List;

import com.allala.DTO.UsersDTO;
import com.allala.entities.News;
import com.allala.entities.Users;

public interface UsersDAO {

	public Users getUserByName(String username);
	public List<News> getAllNewsByUser(String username);
	public void persistUsersDTO(Users user);
	public List<News> getAllNews();
	public List<News> getNewsByloc(Long loc);
	public void addNewsToUser(String username,News news);
	public List<String> getAllUserNames(); 
}
