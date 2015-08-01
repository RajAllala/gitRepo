package com.allala.spring.hibernate.service;

import java.util.List;

import com.allala.hibernate.entities.Address;
import com.allala.hibernate.entities.Degree;
import com.allala.hibernate.entities.MiniPerson;
import com.allala.hibernate.entities.Person;

public interface PersonService {
	
//	public Person getPersonById();
//	public List<Person> getAllPersons();
//	public List<Address> getAddressByPersonId(Long id);
//	public void persistPerson(Person person);
//	public List<Degree> getPesonDegreeById(Long id);
	public String getFirstNameByPersonId(Long id);
	public List<MiniPerson> getPartialDetailsOfPersonById(Long id);
	public void demoTransactionManagementWithPerson(Person person);

}
