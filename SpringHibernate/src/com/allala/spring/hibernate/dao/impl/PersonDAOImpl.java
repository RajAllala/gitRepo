package com.allala.spring.hibernate.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.allala.hibernate.entities.Address;
import com.allala.hibernate.entities.Degree;
import com.allala.hibernate.entities.MiniPerson;
import com.allala.hibernate.entities.Person;
import com.allala.spring.hibernate.dao.PersonDAO;

public class PersonDAOImpl implements PersonDAO {

	HibernateTemplate hTemplate;
	
	
	public void sethTemplate(HibernateTemplate hTemplate) {
		this.hTemplate = hTemplate;
	}

	private SessionFactory sessionFactory;


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Person getPersonById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Address> getAddressByPersonId(Long id) {
		return null;
	}

	@Override
	public void persistPerson(Person person) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(person);
		System.out.println("Done persisting the Person......");
		Address a = new Address();
		a.setAddress1("address1");
		a.setAddress2("address2");
		a.setCity("city");
		a.setCountry("country");
		a.setZipcode("12345");
		System.out.println("Now the DB will throw a Constraint Exception.... and will help us demo Spring Transaction management");
		sessionFactory.getCurrentSession().save(a);
		
	}

	@Override
	public List<Degree> getPesonDegreeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFirstNameByPersonId(Long id){
		
		return hTemplate.findByNamedQueryAndNamedParam("nativeFirstNameById", "p_id", id).toString();
		
	}

	@Override
	public List<MiniPerson> getPartialDetailsOfPersonById(Long id) {
		// TODO Auto-generated method stub
//		Session session = sessionFactory.openSession();
//		MiniPerson m = (MiniPerson) session.getNamedQuery("nativePartialPersonDetails").setParameter("p_id", id).uniqueResult();
		return (List<MiniPerson>) hTemplate.findByNamedQueryAndNamedParam("nativePartialPersonDetails", "p_id", id);
		//return null;
	}

}
