package com.project.spring.hibernate.integrated.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.spring.hibernate.DAO.User_RegistrationDAO;


public class RunAppMain {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
		
		User_RegistrationDAO userDAO = (User_RegistrationDAO) ctx.getBean("User_RegistrationDAO");
		userDAO.sendMailIdAndHash(1L, "this_is_the_registration_hash_code");
		

			
	}

}
