package com.allala.Service;

import java.util.List;

import com.allala.DTO.NewsDTO;
import com.allala.DTO.UsersDTO;
import com.allala.entities.News;
import com.allala.entities.Users;

public interface UserServiceDAO {
	public Users getUserByName(String username);
	public List<News> getAllNewsByUser(String username);
	public void persistUsersDTO(UsersDTO user);
	public List<News> getAllNews();
	public List<News> getNewsByloc(Long loc);
	public void persistNews(NewsDTO news,String username);
	public List<String> getAllUserNames(); 

}
