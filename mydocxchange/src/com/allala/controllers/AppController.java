package com.allala.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	
	private static final String ACTIVE_CLASS="class=\"active\"";
	
	@RequestMapping(value="/")
	public ModelAndView getIndex(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/home")
	public ModelAndView getHome(){
		return new ModelAndView("home").addObject("home",ACTIVE_CLASS);
	}
	
	@RequestMapping(value="/registration")
	public ModelAndView getRegistration(){
		return new ModelAndView("registration").addObject("registration",ACTIVE_CLASS);
	}
	
	@RequestMapping(value="/signin")
	public ModelAndView getSignin(){
		return new ModelAndView("signin").addObject("signin",ACTIVE_CLASS);
	}
	
	@RequestMapping(value="/upload")
	public ModelAndView getUploadPage(){
		return new ModelAndView("upload").addObject("upload",ACTIVE_CLASS);
	}
	
	@RequestMapping(value="/logout")
	public ModelAndView getOut(){
		return new ModelAndView("index").addObject("logout",ACTIVE_CLASS);
	}
}
