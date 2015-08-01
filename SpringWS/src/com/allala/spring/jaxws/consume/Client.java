package com.allala.spring.jaxws.consume;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.allala.spring.jaxws.endpoint.PersonServiceEndpoint;
import com.allala.spring.jaxws.service.PersonService;
import com.allala.spring.jaxws.service.Impl.PersonServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		URL url = null;
		try {
			url = new URL("http://localhost:8080/SpringWS/services/personService?wsdl");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}  
		     
	        QName qname = new QName("http://endpoint.jaxws.spring.allala.com/", "PersonServiceEndpointService");  
	        Service service = Service.create(url, qname);  	        
	        PersonServiceEndpoint ps = service.getPort(PersonServiceEndpoint.class);	        
	        System.out.println(ps.greetMe("Raj"));  
	}

}
