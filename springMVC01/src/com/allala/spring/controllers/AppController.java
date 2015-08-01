package com.allala.spring.controllers;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.allala.spring.beans.dto.Address;
import com.allala.spring.beans.dto.Degree;
import com.allala.spring.beans.dto.Person;
import com.allala.spring.controllers.service.NewsService;
import com.allala.spring.controllers.service.PersonService;

@Controller
public class AppController {
	
	private static final Logger LOGGER=Logger.getLogger(AppController.class);
	@Autowired
	NewsService newsService;
	@Autowired
	PersonService personService;
	
	
	
	@RequestMapping(value="/home")
	@Secured(value={"ROLE_ADMIN"})
		public ModelAndView getMyStuffRoot1(){
			ModelAndView mav = new ModelAndView("index");

				mav.addObject("message","Persons Database");
				mav.addObject("person",personService.getAllpersons());			
			return mav;				
		
	}
	
	@RequestMapping(value="/persons")
	public ModelAndView getallPersons(){
		ModelAndView mav = new ModelAndView("allpersons");

			mav.addObject("message","Persons Database");
			mav.addObject("persons",personService.getAllpersons());			
		return mav;				
	
	}
	@Secured(value={"ROLE_ADMIN"})
	@RequestMapping(value="/deletePerson/{personId}",method= {RequestMethod.GET})
	public ModelAndView deletePerson(@PathVariable Long personId){		
		personService.deletePerson(personId);
		return new ModelAndView("allpersons").addObject("persons", personService.getAllpersons()) ;	
	}
	
	
	@RequestMapping(value="/addPerson",method= {RequestMethod.GET})
	@Secured(value={"ROLE_ADMIN"})
	public ModelAndView getaddPersonScreen(){		
		return new ModelAndView("addPerson","command",new Person()) ;				
	
	}
	
	@RequestMapping(value="/addPerson",method= {RequestMethod.POST})
	@Secured(value={"ROLE_ADMIN"})
	public ModelAndView addAddress(@ModelAttribute("person") Person person){
		
		personService.persistPersonDTO(person);;
		return new ModelAndView("allpersons").addObject("persons", personService.getAllpersons()) ;				
	}
	
	@RequestMapping(value="/addAddress/{firstName}/{lastName}/{personId}",method= {RequestMethod.GET})
	@Secured(value={"ROLE_ADMIN"})
	public ModelAndView getaddAddressScreen(@PathVariable String firstName,@PathVariable String lastName,
			@PathVariable long personId){
		
		Address a = new Address();
		a.setFirstName(firstName);
		a.setLastName(lastName);
		a.setPersonId(personId);
		
		return new ModelAndView("addAddress","command",a).addObject("Title", "Add Address") ;				
	
	}
	
	@RequestMapping(value="/addAddress/{personId}",method= {RequestMethod.POST})
	@Secured(value={"ROLE_ADMIN"})
	public ModelAndView addPerson(@ModelAttribute("address") Address address,@PathVariable Long personId ){
		personService.persistPersonAddress(address, personId);
		return new ModelAndView("allpersons").addObject("persons", personService.getAllpersons()) ;				
	}
	
	
	@RequestMapping(value="/addDegree/{firstName}/{lastName}/{personId}",method= {RequestMethod.GET})
	@Secured(value={"ROLE_ADMIN"})
	public ModelAndView getaddDegreeScreen(@PathVariable String firstName,@PathVariable String lastName,
			@PathVariable Long personId){		
		
		Degree d = new Degree();
		d.setFirstName(firstName);
		d.setLastName(lastName);
		d.setPersonId(personId);
		return new ModelAndView("addDegree","command",d).addObject("title", "Add Degree") ;				
	
	}
	
	@RequestMapping(value="/addDegree/{personId}",method= {RequestMethod.POST})
	@Secured(value={"ROLE_ADMIN"})
	public ModelAndView addDegree(@ModelAttribute("degree") Degree degree,@PathVariable Long personId){
		
		personService.persistPersonDegree(degree, personId);
		return new ModelAndView("allpersons").addObject("persons", personService.getAllpersons()) ;				
	}
	
	
	
	
	
	
//	@RequestMapping(value="/{symbol}")
//	public ModelAndView getMyStuffRoot(@PathVariable String symbol, Model map){
//		ModelAndView mav = new ModelAndView("index");
//		
//		if(symbol!=null){
//			mav.addObject("message", " Corporate News for " +symbol);
//			mav.addObject("news", newsService.getNewsBySymbol(symbol));
//		}
//		if(symbol==null){
//			mav.addObject("message", "Corporate News");
//			mav.addObject("news", newsService.getAllNews());
//		}
//		
//		return mav;				
//		
//	}
//	
//	@RequestMapping(value="/newsBydate/{date}")
//	public ModelAndView getMyStuffRoot2(@PathVariable Date date, Model map){
//		ModelAndView mav = new ModelAndView("index");
//		
//		if(date!=null){
//			mav.addObject("message", " Corporate News for " +date);
//			mav.addObject("news", newsService.getAllNewsOnADate(date));
//		}
//		if(date==null){
//			mav.addObject("message", "Corporate News");
//			mav.addObject("news", newsService.getAllNews());
//		}
//		
//		return mav;				
//		
//	}
	
	
//	@RequestMapping("/home")
//	public ModelAndView getMyStuffHome(@RequestParam(value="symbol") String symbol,@RequestParam(value="year") String year, Model map){
//		
//		ModelAndView mav = new ModelAndView("index");
//		
//		if(null!=symbol){
//			mav.addObject("message", " Corporate News for " +symbol+ "," +year);
//			mav.addObject("news", newsService.getNewsBySymbol(symbol));
//		}
//		else{
//			mav.addObject("message", "Corporate News");
//			mav.addObject("news", newsService.getAllNews());
//		}
//		
//		return mav;		
//		
//	}
	
	@RequestMapping("/contact")
	@Secured(value="ROLE_PERSON")
	public ModelAndView getMyStuffContact(){
		
		return new ModelAndView("contact","message","I am the contact Page");
		
	}
	
	@RequestMapping("/")
	public ModelAndView gethome( ){
		System.out.println("In Home");
		LOGGER.warn("Logger: In Home");
		return new ModelAndView("home","message","AM Home");
		
	}
	
	@RequestMapping("/signin")
	public ModelAndView getSigninform(){
		return new ModelAndView("signin");
	}	
	
	@RequestMapping("/unauthorized")
	public ModelAndView getunauthorizedpage(){
		return new ModelAndView("unauthorized","message","Oops not authorized");
	}	
	
	@RequestMapping("/aboutus")
	public ModelAndView getMyStuffAbout(){
		
		return new ModelAndView("aboutus","message","I am the aboutus Page");
		
	}

}
