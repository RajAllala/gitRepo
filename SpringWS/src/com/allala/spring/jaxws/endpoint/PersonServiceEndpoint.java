package com.allala.spring.jaxws.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import com.allala.spring.jaxws.service.PersonService;

@WebService
public class PersonServiceEndpoint extends SpringBeanAutowiringSupport{
	
	@Autowired
	private PersonService personService;
	
	@WebMethod(exclude=true)
	public PersonService getPersonService() {
		
		if(null == personService){
			SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
		}
		return personService;
	}

	
	@WebMethod(operationName="sayGreetings")
	@WebResult(name="Greetings")
	public String greetMe(@WebParam(name="GreetParam") String me){
		return getPersonService().greetMe(me);
	}
	
}
