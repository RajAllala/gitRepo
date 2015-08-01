package com.allala.Impl;

import java.util.List;

import org.springframework.orm.hibernate4.HibernateTemplate;

import com.allala.DAO.UserDAO;
import com.allala.entities.News;
import com.allala.entities.User;

public class UserDAOImpl implements UserDAO {

	
	private HibernateTemplate hTemplate;
	
	
	public HibernateTemplate gethTemplate() {
		return hTemplate;
	}

	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	@Override
	public User getUserById(Long id) {
		
		return (User) hTemplate.findByNamedQueryAndNamedParam("nativeUserById","id",id).get(0);
		//return (User) hTemplate.findByNamedParam("from User where id=:id","id",new Object[]{id}).get(0);
	}

	@Override
	public List<News> getAllNewsByUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
