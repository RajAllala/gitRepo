package com.allala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.allala.mail.service.MailService;
import com.allala.mail.service.Impl.GmailServiceImpl;

public class RunApp {

	public static void main(String[] args) {
		
		String email = "Joe Sandy <josandy001@gmail.com> ";
		int x = email.indexOf("<");
		int y = email.indexOf(">");
		
		System.out.println(email.substring(x+1, y));
		
	}

}
