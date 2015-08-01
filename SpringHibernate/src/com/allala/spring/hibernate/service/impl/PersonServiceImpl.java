package com.allala.spring.hibernate.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.allala.hibernate.entities.MiniPerson;
import com.allala.hibernate.entities.Person;
import com.allala.spring.hibernate.dao.PersonDAO;
import com.allala.spring.hibernate.service.PersonService;

public class PersonServiceImpl implements PersonService {
	
	private PersonDAO personDAO;

	
	public PersonDAO getPersonDAO() {
		return personDAO;
	}

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Override
	public String getFirstNameByPersonId(Long id) {
		// TODO Auto-generated method stub
		return personDAO.getFirstNameByPersonId(id);
	}

	@Override
	public List<MiniPerson> getPartialDetailsOfPersonById(Long id) {
		// TODO Auto-generated method stub
		return personDAO.getPartialDetailsOfPersonById(id);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void demoTransactionManagementWithPerson(Person person) {
		// TODO Auto-generated method stub
		personDAO.persistPerson(person);
		
	}

}
