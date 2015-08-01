package com.teama.test.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import com.teama.DAO.UsersDAO;
import com.teama.DAO.ForumDao;
import com.teama.entities.Answers;
import com.teama.entities.Questions;
import com.teama.entities.User;
import com.teama.entities.User_info;
import com.teama.service.UserService;
@Service
@Transactional

public class TestIMPL {
	
	@Autowired
	private HibernateTemplate hTemplate;
	@Autowired
	private ForumDao forumDao;
	
	@Autowired
	private UsersDAO userDAO;
	@Autowired
	private UserService userService;
	
	User user = new User();
	User_info user_info = new User_info();
	
	@Transactional
	public User getUser(String username){
		/*User u = (User) hTemplate.getSessionFactory().getCurrentSession().createSQLQuery(
				"SELECT username from USERS WHERE username=\'"+username+"\'").uniqueResult();*/
		
		return (User) hTemplate.findByNamedQueryAndNamedParam("test_user", "username",username).get(0);
		//return u.getUser_email();
		
	}
	
	public Questions getQ(String username){
		return (Questions) hTemplate.findByNamedQueryAndNamedParam("test_q", "username", username).get(0);
		
	}
	
	public User_info getUserinfo(String username){
		//return (User_info) hTemplate.findByNamedQueryAndNamedParam("test_user_info", "id",id).get(0);
	
	return userDAO.getProfile(username);
	}

	
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return forumDao.getAllQuestions();
	}

	
	public Questions getQuestion(Long id) {
		// TODO Auto-generated method stub
		return forumDao.getQuestion(id);
	}

	

	public List<Questions> getUserQuestions(String username) {
		// TODO Auto-generated method stub
		return forumDao.getUserQuestions(username);
	}


	public String persistQuestion(String question, String username) {
		// TODO Auto-generated method stub
		return forumDao.persistQuestion(question, username);
		
	}

	
	public void persistAnswer(String answer, Long question_id, String username) {
		// TODO Auto-generated method stub
		forumDao.persistAnswer(answer, question_id, username);
	}

	public List<Answers> getAnsforQuestion(Long id) {
		// TODO Auto-generated method stub
		return forumDao.getAnsforQuestion(id);
	}

	public List<User_info> getallUsers() {
		// TODO Auto-generated method stub
		return userService.getallUsers();
	}
	

}
