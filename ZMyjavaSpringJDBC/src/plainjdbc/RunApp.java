package plainjdbc;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		jdbcService js = (jdbcService) ctx.getBean("jdbcService");
		System.out.println(js.getDataById());
		
//		for(Map<String, Object> jd:js.getDataById()){
//			System.out.print(jd.getId()+" ");
//			System.out.print(jd.getName()+" ");
//			System.out.println(((Object) jd).getAge()+" ");
//			
//		}
		
	}
		
}
