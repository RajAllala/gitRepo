package com.allala.spring.controllers.service;

import java.util.List;

import com.allala.spring.hibernate.entities.Address;
import com.allala.spring.hibernate.entities.Degree;
import com.allala.spring.hibernate.entities.Person;

public interface PersonService {
	
	public List<Person> getAllpersons();
	public Person getPersonByFirstName(String firstName);
	public void addPersonDetails(Address address,Degree degree,Long personId);
	void persistPersonDTO(com.allala.spring.beans.dto.Person person);
	void persistPersonAddress(com.allala.spring.beans.dto.Address addressDTO,Long personId);
	void persistPersonDegree(com.allala.spring.beans.dto.Degree degreeDTO,Long personId);
	void persistPerson(Person person);
	public void deletePerson(Long id);

}
