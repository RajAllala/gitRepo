package com.teama.DAO.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.teama.DAO.ForumDao;
import com.teama.entities.Answers;
import com.teama.entities.Questions;
import com.teama.entities.User;
@Repository
public class ForumDaoImpl implements ForumDao {

	@Autowired
	private HibernateTemplate hTemplate;
	@Override
	public List<Questions> getAllQuestions() {
		// TODO Auto-generated method stub
		return  hTemplate.loadAll(Questions.class);
	}

	@Override
	public Questions getQuestion(Long id) {
		// TODO Auto-generated method stub
		
		return (Questions) hTemplate.findByNamedQueryAndNamedParam("questions", "q_id",id).get(0);
	}

	@Override
	public List<Questions> getUserQuestions(String username) {
		// TODO Auto-generated method stub
		return (List<Questions>) hTemplate.findByNamedQueryAndNamedParam("userquestions", "username",username);
		
	}

	@Override
	public String persistQuestion(String question, String username) {
		// TODO Auto-generated method stub
		//User user=(User) hTemplate.findByNamedQueryAndNamedParam("getuser", "username",username).get(0);
		Questions questions= new Questions(question,username);
		hTemplate.save(questions);
		return questions.getId().toString();
	}

	@Override
	public void persistAnswer(String answer, Long question_id, String username) {
		// TODO Auto-generated method stub
		User user=(User) hTemplate.findByNamedQueryAndNamedParam("getuser", "username",username).get(0);
		
		Answers answers = new Answers(answer,username,question_id);
		hTemplate.save(answers);

	}

	@Override
	public List<Answers> getAnsforQuestion(Long id) {
		// TODO Auto-generated method stub
		
		return (List<Answers>) hTemplate.findByNamedQueryAndNamedParam("getansquestion", "q_id",id);
		
	}

	@Override
	public List<Questions> getUnAnsQuestions() {
		// TODO Auto-generated method stub
		
		
		return hTemplate.getSessionFactory().getCurrentSession().getNamedQuery("unansquestions").list();
	}

	@Override
	public List<Questions> getAnsweredQuestions() {
		// TODO Auto-generated method stub
		return hTemplate.getSessionFactory().getCurrentSession().getNamedQuery("allansquestions").list();
	}

	@Override
	public List<Questions> getTrainerQuestions(String tech_type) {
		// TODO Auto-generated method stub
		return (List<Questions>) hTemplate.findByNamedQueryAndNamedParam("trainerquestions", "tech_type",tech_type);

	}

}
