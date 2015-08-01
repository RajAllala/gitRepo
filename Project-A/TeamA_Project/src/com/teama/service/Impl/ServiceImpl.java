package com.teama.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teama.DAO.ForumDao;
import com.teama.service.ForumService;
import com.teama.entities.Answers;
import com.teama.entities.Questions;
@Service
@Transactional
public class ServiceImpl implements ForumService {
@Autowired
ForumDao forumDao;
	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return forumDao.getAllQuestions();
	}

	@Override
	public Questions getQuestion(Long id) {
		// TODO Auto-generated method stub
		return forumDao.getQuestion(id);
	}

	@Override
	public List<Questions> getUserQuestions(String username) {
		// TODO Auto-generated method stub
		return forumDao.getUserQuestions(username);
	}

	@Override
	public String persistQuestion(String question, String username) {
		// TODO Auto-generated method stub
		return forumDao.persistQuestion(question, username);

	}

	@Override
	public void persistAnswer(String answer, Long question_id, String username) {
		// TODO Auto-generated method stub
		forumDao.persistAnswer(answer, question_id, username);

	}

	@Override
	public List<Answers> getAnsforQuestion(Long id) {
		// TODO Auto-generated method stub
		return forumDao.getAnsforQuestion(id);
	}

	@Override
	public List<Questions> getTrainerQuestions(String tech_type) {
		// TODO Auto-generated method stub 
		return forumDao.getTrainerQuestions(tech_type);
	}

}
