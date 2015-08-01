package com.allala.spring.hibernate.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.allala.spring.hibernate.dao.PersonDAO;
import com.allala.spring.hibernate.entities.Address;
import com.allala.spring.hibernate.entities.Degree;
import com.allala.spring.hibernate.entities.Person;
@Repository
public class PersonDAOImpl implements PersonDAO {
	
	@Autowired
	private HibernateTemplate hTemplate;

	@Override
	public void persistPerson(Person person) {
		// TODO Auto-generated method stub
		hTemplate.save(person);
		
	}

	@Override
	public List<Person> getAllpersons() {
		// TODO Auto-generated method stub
		return hTemplate.loadAll(Person.class);
	}

	@Override
	public Person getPersonByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return (Person) hTemplate.findByNamedParam("from Person where firstName=:firstName", "firstName", new Object[]{firstName});
	}

	@Override
	public void addAddressToPerson(Address address, Long personId) {
		// TODO Auto-generated method stub
		Person p = hTemplate.load(Person.class,personId);
		address.setPerson(p);
		p.getAddresses().add(address);
		hTemplate.save(p);
		
	}

	@Override
	public void addDegreeToPerson(Degree degree, Long personid) {
		Person p = hTemplate.load(Person.class,personid );
		degree.setPerson(p);
		p.getDegrees().add(degree);
		hTemplate.save(p);
		
	}
	

	@Override
	public void addPersonDetails(Address address, Degree degree, Long personId) {
		// TODO Auto-generated method stub
		Person p = hTemplate.load(Person.class,personId);
		if(null!=address){
			p.getAddresses().add(address);
		}
		if(null!=degree){
			p.getDegrees().add(degree);
		}
		hTemplate.save(p);
		
	}

	@Override
	public void deletePerson(Long id) {
		// TODO Auto-generated method stub
		Person p = hTemplate.load(Person.class,id);
		hTemplate.delete(p);
		
	}

}
