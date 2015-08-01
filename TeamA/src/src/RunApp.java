import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.allala.Service.UserServiceDAO;


public class RunApp {

	public static void main(String[] args) {		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
		UserServiceDAO user = (UserServiceDAO) ctx.getBean("userService");
		System.out.println(user.getUserById(1L));

	}

}
