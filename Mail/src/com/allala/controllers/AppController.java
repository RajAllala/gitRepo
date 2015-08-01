package com.allala.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@RequestMapping(value="/index")
	public ModelAndView getMail(){
		return new ModelAndView("index");
	}

}
