package com.teama.DAO;

import java.util.List;

import com.teama.entities.Answers;
import com.teama.entities.Questions;



public interface ForumDao {
	
	public List<Questions> getAllQuestions();
	public Questions getQuestion(Long id);
	public List<Questions> getUserQuestions(String username);
	public String persistQuestion(String question, String username);
	public void persistAnswer(String answer, Long question_id, String username);
	public List<Answers> getAnsforQuestion(Long id );
	public List<Questions> getUnAnsQuestions();
	public List<Questions> getAnsweredQuestions();
	public List<Questions> getTrainerQuestions(String tech_type);

}
