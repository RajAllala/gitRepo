package com.allala.spring.jaxws.service.Impl;

import org.springframework.stereotype.Service;

import com.allala.spring.jaxws.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Override
	public String greetMe(String me) {
		// TODO Auto-generated method stub
		return "hey I am Spring Intergrated WS !!" +me;
	}

}
