package com.spring.rest.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.spring.rest.entity.Person;
import com.spring.rest.service.PersonService;
@Service // Lets spring know about this class when Autowiring 
public class PersonServiceImpl implements PersonService {

	@Override
	public List<Person> getAllPersons() {
		List<Person> p = new ArrayList<Person>();
		//Hardcoding Person detials to be exposed through REST  
		p.add(new Person("John","David",27,"john@test.com"));
		p.add(new Person("Max","Well",30,"max@example.com"));
		p.add(new Person("Mitch","Marsh",34,"mitch@test.com"));
		p.add(new Person("David","Hussey",29,"david@example.com"));
	
		return p;
	}
}
