package com.teama.service;

import java.util.List;

import com.teama.entities.Answers;
import com.teama.entities.Questions;

public interface ForumService {
	
	public List<Questions> getAllQuestions();
	public Questions getQuestion(Long id);
	public List<Questions> getUserQuestions(String username);
	public String persistQuestion(String question, String username);
	public void persistAnswer(String answer, Long question_id, String username);
	public List<Answers> getAnsforQuestion(Long id );
	public List<Questions> getTrainerQuestions(String tech_type);

}
