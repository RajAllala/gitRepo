package com.allala.mail.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allala.Mail;
import com.allala.mail.DAO.MailDAO;
import com.allala.mail.DAO.Impl.MailDAOImpl;
import com.allala.mail.service.MailService;

@Service
public class GmailServiceImpl implements MailService {

	@Autowired
	MailDAO mailDAO;
	
	
	public MailDAO getMailDAO() {
		return mailDAO;
	}

	public void setMailDAO(MailDAO mailDAO) {
		this.mailDAO = mailDAO;
	}

	@Override
	public List<Mail> getMail() {
		return mailDAO.getMail();
	}

	@Override
	public void sendMail(String from, String subject, String emailid) {
		
	}

	@Override
	public List<Mail> getCachedMail() {
		return null;
	}

}
