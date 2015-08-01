import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.TeamA.spring.hibernate.entities.News;
import com.TeamA.spring.hibernate.entities.User;
import com.TeamA.spring.hibernate.service.NewsService;
import com.TeamA.spring.hibernate.service.UserService;


public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
		
		UserService us = (UserService) ctx.getBean("userService");
		System.out.println(us.getUserById(1L));
	}

}
