package com.teama.DTO;

public class AnswersDTO {
private String answerText;
private String username;
private Long questions_id;

public Long getQuestions_id() {
return questions_id;
}

public void setQuestions_id(Long questions_id) {
this.questions_id = questions_id;
}

public String getAnswerText() {
return answerText;
}

public void setAnswerText(String answerText) {
this.answerText = answerText;
}

public String getUsername() {
return username;
}

public void setUsername(String username) {
this.username = username;
}
}