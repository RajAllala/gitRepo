package com.allala.spring.hibernate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.allala.spring.hibernate.service.NewsService;
import com.allala.spring.hibernate.service.PersonService;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.application.xml");
		
		PersonService ps = (PersonService) ctx.getBean("personService");
		System.out.println(ps.getFirstNameByPersonId(60L));
		System.out.println(ps.getPartialDetailsOfPersonById(92L));

	}

}
