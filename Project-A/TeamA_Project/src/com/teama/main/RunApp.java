package com.teama.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teama.DAO.UsersDAO;
import com.teama.DAO.Impl.UsersDAOImpl;
import com.teama.test.impl.TestIMPL;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
		TestIMPL test = (TestIMPL) ctx.getBean("test");
		
		
		/*System.out.println(test.getUser("abc@gmail.com"));
		System.out.println(test.getUserinfo(1L).getCity());
		System.out.println(test.getQ("abc@gmail.com").getAnswers().get(0).getAnswerText());*/

		/*test.persistQuestion("What is your team name", "abc@gmail.com");
		test.persistAnswer("my team is A", 2L, "abc@gmail.com");*/
		System.out.println(test.getallUsers());
		//System.out.println(test.getUserinfo("abc@gmail.com"));
		
		
		//System.out.println(test.);
		
	}

}
