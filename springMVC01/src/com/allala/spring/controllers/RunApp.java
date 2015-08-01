package com.allala.spring.controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("../../WebContent/WEB-INF/spring/springbeans.xml");
		JdbcTest jt = (JdbcTest) ctx.getBean("JdbcTest");
		
		System.out.println(jt.getAge());

	}

}
