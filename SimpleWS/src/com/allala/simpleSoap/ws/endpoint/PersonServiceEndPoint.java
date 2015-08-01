package com.allala.simpleSoap.ws.endpoint;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.allala.simpleSoap.ws.beans.Person;
import com.allala.simpleSoap.ws.cache.DataCache;

@WebService(name="PersonService")
public class PersonServiceEndPoint {
	
	@WebMethod(operationName="SimpleMethod")
	@WebResult(name="GreetBack")
	public String greetMe(@WebParam(name="me") String me){
		return "hey I am working by SOAP !!" + me;
	}

	@WebMethod(operationName="personFetch")
	@WebResult(name="personList")
	public List<Person> getPersons(){
		return DataCache.getINSTANCE().getAllperons(); 
	}
	
	@WebMethod(operationName="addPerson")
	@WebResult(name="status")
	public String addPerson(@WebParam(name="firstname")String fname,
							@WebParam(name="Lastname")String lname,
							@WebParam(name="Empid")Long empid){
	
		Person p = new Person(fname,lname,empid);
		try{
			DataCache.getINSTANCE().addPerson(p);
			return "SUCCESS";
		}catch(Exception e){
			e.printStackTrace();
		}
		return "FAIL";
	}
}
