package com.allala.mail.DAO;

import java.util.List;

import com.allala.Mail;

public interface MailDAO {
	
	public List<Mail> getMail();
	public void sendMail(String from,String subject,String emailid);

}
