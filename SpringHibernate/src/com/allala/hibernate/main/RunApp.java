package com.allala.hibernate.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.allala.hibernate.entities.Address;
import com.allala.hibernate.entities.Degree;
import com.allala.hibernate.entities.News;
import com.allala.hibernate.entities.Person;

@SuppressWarnings("deprecation")
public class RunApp {

	private static SessionFactory sessionFactory;
	static{
		try{
		sessionFactory = new Configuration().configure().buildSessionFactory();
		}catch(Exception ex){
			System.out.println("Error loading hibernate configuration");
			ex.printStackTrace();
		}
	}
	
	
	public static List<News> getAllNews(){
		List<News> news = new ArrayList<News>();
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from  News where id=:id");
		news = q.list();
		session.close();
		sessionFactory.close();
		return news;
		
	}
	
	public static void saveOrUpdateNews(News news){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.saveOrUpdate(news);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
		
	}
	
	public static News getNewsById(Long id){
		News n = null;
		Session session = sessionFactory.openSession();
		Query q = session.createQuery("from  News where id=:id");
		n = (News) q.setParameter("id", id).uniqueResult();
		session.close();
		sessionFactory.close();
		return n;
		
	}

	public static void main(String[] args) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Person person = new Person();
		person.setEmail("raj.allala@gmail.com");
		person.setFirstName("Raj");
		person.setLastName("Allala");
		person.setPhoneNumber("1234567890");
//		
		Set<Address> myaddresses = new HashSet<Address>();
		myaddresses.add(new Address("Adrs1","Adrs2","Mycity","Mycountry","39560",person));
		person.setAddresses(myaddresses);
//		
		Set<Degree> myDegrees = new HashSet<Degree>();
		myDegrees.add(new Degree("MS","USM","Computer Science","CAS","2011",person));
		person.setDegrees(myDegrees);
//		
		session.save(person);
		
		Person pd = (Person) session.load(Person.class, 42L);
		session.delete(pd);
		session.getTransaction().commit();
		
		
		
//		Person p = (Person) session.getNamedQuery("nativePersonById").setParameter("p_id", 92L).uniqueResult();
//		System.out.println(p.getAddresses());
		
//		Criteria criteria = session.createCriteria(Person.class);
//		criteria.add(Restrictions.between("id", 20L, 50L));
//		
//		
//		for(Person p : (List<Person>) criteria.list()){
//			System.out.println(p);
//		}
		
		session.close();
		sessionFactory.close();
	}

}
