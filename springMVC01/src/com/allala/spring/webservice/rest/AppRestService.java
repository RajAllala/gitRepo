package com.allala.spring.webservice.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allala.spring.controllers.service.NewsService;
import com.allala.spring.controllers.service.PersonService;
import com.allala.spring.hibernate.entities.Address;
import com.allala.spring.hibernate.entities.Degree;
import com.allala.spring.hibernate.entities.News;
import com.allala.spring.hibernate.entities.Person;

@RestController
@RequestMapping("/service/api")
public class AppRestService {

	@Autowired
	private NewsService newsService;
	@Autowired
	private PersonService personService;
	
	
	@RequestMapping("/allPersons")
	
	public List<com.allala.spring.beans.dto.Person> getAllPersons(){
		List<com.allala.spring.beans.dto.Person> persons = new ArrayList<com.allala.spring.beans.dto.Person>();
		
		for(Person p : personService.getAllpersons()){
			List<com.allala.spring.beans.dto.Address> address = new ArrayList<>();
			
			for(Address a : p.getAddresses() ){
				address.add(new com.allala.spring.beans.dto.Address(a.getAddress1(),a.getAddress2(),
						a.getCity(),a.getCountry(),a.getZipcode(),null,null,null));
			}
			
			List<com.allala.spring.beans.dto.Degree> degree = new ArrayList<>();
			for(Degree a : p.getDegrees()){
				degree.add(new com.allala.spring.beans.dto.Degree(a.getDegreeName(),a.getUniversity(),
						a.getMajor(),a.getYearPassedOut(),a.getMinor()));
			}
			
			persons.add(new com.allala.spring.beans.dto.Person(p.getFirstName(),p.getLastName(),p.getEmail(),p.getPhonenumber(),address,degree));
		}
		return persons;
	}
	
	@RequestMapping("/allNews")
	
	public List<News> getAllNews(){
		return newsService.getAllNews();
	}
	
	@RequestMapping("/News/{symbol}")
	
	public List<News> getNewsBySymbol(@PathVariable String symbol){
		return newsService.getNewsBySymbol(symbol);
	}
	
}
