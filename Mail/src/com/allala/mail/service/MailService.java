package com.allala.mail.service;

import java.util.List;

import com.allala.Mail;

public interface MailService {
	public List<Mail> getMail();
	public void sendMail(String from,String subject,String emailid);
	
	public List<Mail> getCachedMail();

}
