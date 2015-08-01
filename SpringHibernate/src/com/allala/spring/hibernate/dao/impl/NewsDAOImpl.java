package com.allala.spring.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.allala.custom.function.MyCustomFuction;
import com.allala.hibernate.entities.News;
import com.allala.spring.hibernate.dao.NewsDAO;

public class NewsDAOImpl implements NewsDAO {
	private SessionFactory sessionFactory;
	private MyCustomFuction myCustom;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void setMyCustom(MyCustomFuction myCustom) {
		this.myCustom = myCustom;
	}

	@Override
	public void saveOrUpdateNews(News news) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(news);

	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		List<News> news = new ArrayList<News>();
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from  News");
		news = q.list();
		session.close();
		
		return news;

	}

	@Override
	public News getNewsById(Long id) {
		// TODO Auto-generated method stub
		News n = null;
		Session session = sessionFactory.openSession();
		int i=3;
		while(i>0){
		Query q = session.createQuery("from  News where id =:id");
		n = (News) q.setParameter("id", id).uniqueResult();
		i--;
		}
		System.out.println("No of time to DB: ");
		session.close();
		
		return n;
	}

	@Override
	public void deleteNews(News news) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(news);
		session.getTransaction().commit();
		session.close();
		
		
	}

	@Override
	public void myCustomBigFunction() {
		// TODO Auto-generated method stub
		
		myCustom.myCustomBigFunction();
	}

	@Override
	public void printMyMessage(String message) {
		// TODO Auto-generated method stub
		myCustom.printMyMessage("Spring IOC is Awesome!!!!");
	}

	@Override
	public void printMyInfo() {
		// TODO Auto-generated method stub
		myCustom.printMyInfo();
		
	}

}
