package com.allala.spring.hibernate.dao;

import java.util.List;

import com.allala.spring.hibernate.entities.Address;
import com.allala.spring.hibernate.entities.Degree;
import com.allala.spring.hibernate.entities.Person;

public interface PersonDAO {
	
	public void persistPerson(Person person);
	public List<Person> getAllpersons();
	public Person getPersonByFirstName(String firstName);
	public void addAddressToPerson(Address address,Long personId);
	public void addDegreeToPerson(Degree degree,Long personId);
	public void addPersonDetails(Address address,Degree degree,Long personId);
	public void deletePerson(Long id);
	
	

}
