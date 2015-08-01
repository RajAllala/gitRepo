	package com.allala.spring.controllers.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.allala.spring.controllers.service.PersonService;
import com.allala.spring.hibernate.dao.PersonDAO;
import com.allala.spring.hibernate.entities.Address;
import com.allala.spring.hibernate.entities.Degree;
import com.allala.spring.hibernate.entities.Person;

@Transactional(readOnly = false)
@Service
public class PersonServiceImpl implements PersonService {
	@Autowired
	PersonDAO personDAO;

	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void persistPerson(Person person) {
		// TODO Auto-generated method stub
		personDAO.persistPerson(person);
		
	}

	@Override
	
	public List<Person> getAllpersons() {
		// TODO Auto-generated method stub
		return personDAO.getAllpersons();
	}

	@Override
	
	public Person getPersonByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return personDAO.getPersonByFirstName(firstName);
	}
	
	@Override
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void addPersonDetails(Address address,Degree degree,Long personId){
		personDAO.addPersonDetails(address, degree, personId);
	}
	

	@Override
	public void persistPersonAddress(com.allala.spring.beans.dto.Address addressDTO,Long personId) {
		// TODO Auto-generated method stub
		
		Address a = new Address(addressDTO.getAddress1(), addressDTO.getAddress2(), addressDTO.getCity(), addressDTO.getCountry(), addressDTO.getZipcode());
		personDAO.addAddressToPerson(a, personId);
		
	}

	@Override
	public void persistPersonDegree(
			com.allala.spring.beans.dto.Degree degreeDTO, Long personId) {
		// TODO Auto-generated method stub
		Degree d = new Degree(degreeDTO.getDegreeName(),degreeDTO.getUniversity(),degreeDTO.getYearPassedOut(),
				degreeDTO.getMajor(),degreeDTO.getMinor());
		personDAO.addDegreeToPerson(d, personId);
		
	}

	@Override
	public void persistPersonDTO(com.allala.spring.beans.dto.Person person) {
		// TODO Auto-generated method stub
		Person p = new Person(person.getFirstName(), person.getLastName(), person.getPhonenumber(), person.getEmail());
		personDAO.persistPerson(p);
	}

	@Override
	public void deletePerson(Long id) {
		// TODO Auto-generated method stub
		personDAO.deletePerson(id);
		
	}
	
	

}
