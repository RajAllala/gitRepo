package com.allala.spring.hibernate.dao;

import java.util.List;

import com.allala.hibernate.entities.Address;
import com.allala.hibernate.entities.Degree;
import com.allala.hibernate.entities.MiniPerson;
import com.allala.hibernate.entities.Person;

public interface PersonDAO {
	
	public Person getPersonById();
	public List<Person> getAllPersons();
	public List<Address> getAddressByPersonId(Long id);
	public void persistPerson(Person person);
	public List<Degree> getPesonDegreeById(Long id);
	public String getFirstNameByPersonId(Long id);
	public List<MiniPerson> getPartialDetailsOfPersonById(Long id);

}
