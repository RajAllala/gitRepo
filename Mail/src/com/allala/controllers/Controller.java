package com.allala.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allala.Mail;
import com.allala.mail.service.MailService;

@RestController
public class Controller {

	@Autowired
	MailService mailService;
	
	@RequestMapping(value= "/mail")
	public List<Mail> getMail(){
		return mailService.getMail();
	}
	
}

