package com.allala.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.allala.DAO.UsersDAO;
import com.allala.DTO.UsersDTO;
import com.allala.entities.Authorities;
import com.allala.entities.News;
import com.allala.entities.Users;
@Repository
public class UsersDAOImpl implements UsersDAO {

	@Autowired
	private HibernateTemplate hTemplate;
	
	
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}


	@Override
	public void persistUsersDTO(Users user) {
		
		Authorities a = new Authorities(user.getUsername(),"ROLE_PERSON");
		hTemplate.saveOrUpdate(user);
		hTemplate.saveOrUpdate(a);
		
	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		return hTemplate.loadAll(News.class);
	}

	@Override
	public List<News> getNewsByloc(Long loc) {
		// TODO Auto-generated method stub
		return (List<News>) hTemplate.findByNamedQueryAndNamedParam("nativeNewsByLoc", "location", loc);
	}

	@Override
	public Users getUserByName(String username) {
		// TODO Auto-generated method stub
		return (Users) hTemplate.findByNamedQueryAndNamedParam("nativeUserById","username",username).get(0);
		
	}
	
	
	

	@Override
	public List<News> getAllNewsByUser(String username) {
		// TODO Auto-generated method stub
		 return (List<News>) hTemplate.findByNamedQueryAndNamedParam("nativeUserNewsById", "username", username);
	}


	@Override
	public void addNewsToUser(String username, News news) {
		// TODO Auto-generated method stub
		/*Users u = hTemplate.load(Users.class, username);
		news.setUser(u);
		//u.getNews().add(news);
		hTemplate.saveOrUpdate(u);*/
		
	}

	@Override
	public List<String> getAllUserNames() {
		// TODO Auto-generated method stub
		return (List<String>) hTemplate.getSessionFactory().openSession().getNamedQuery("nativeUsers");
	}

}
