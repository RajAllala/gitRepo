package com.allala.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.allala.jdbc.spring.beans.News;
import com.allala.jdbc.spring.ioc.service.NewsService;

public class RunApp {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springbeans.xml");
		
		NewsService ns = (NewsService) ctx.getBean("newsService");
		 
	//	ns.deleteNews((long) 2011);
		//ns.modifyNews(new News(123456799L,"asdfghjk","hello","ALLALA"));
	System.out.println(ns.fetchNewsById(123456789L).getHeadlines());
		
		
//		for(News news: ns.getEveryNews()){
//			System.out.print(news.getId());
//			System.out.print(news.getHeadlines());
//			System.out.print(news.getMaincontent());
//			System.out.println(news.getReporter());
//			System.out.println("-----------------------------");
			
//			String modifiedcontent = news.getHeadlines().replaceAll("allala-Test","");
//			news.setHeadlines(modifiedcontent);
//			ns.modifyNews(news);
	//	}
		
	}
}
