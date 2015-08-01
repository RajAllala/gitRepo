package com.docxchange.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.docxchange.spring.mail.MailMail;

@RestController
public class AppController {
	
	@RequestMapping(value="/email/{id}")

	public String sendmail(@PathVariable(value="id") String id){
		
		MailMail mail = new MailMail();
		mail.sendMail(id);
		return "Success";
	}
	
	@RequestMapping("/")
	public ModelAndView test(){
		return null;
	}
	
}
