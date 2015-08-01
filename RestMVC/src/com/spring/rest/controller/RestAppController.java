package com.spring.rest.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.rest.entity.Person;
import com.spring.rest.service.PersonService;

@RestController // Makes the controller to throw a json object
public class RestAppController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value="/data") 
	public List<Person> getPersonData(){
		return personService.getAllPersons();	
	}
}
