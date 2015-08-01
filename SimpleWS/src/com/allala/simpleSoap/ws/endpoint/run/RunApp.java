package com.allala.simpleSoap.ws.endpoint.run;

import javax.xml.ws.Endpoint;

import com.allala.simpleSoap.ws.endpoint.PersonServiceEndPoint;

public class RunApp {

	public static void main(String[] args) {

		Endpoint.publish("http://localhost:9091/PersonService", new PersonServiceEndPoint());
	}

}
