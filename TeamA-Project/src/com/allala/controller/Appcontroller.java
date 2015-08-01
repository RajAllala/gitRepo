package com.allala.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.allala.DTO.NewsDTO;
import com.allala.DTO.UsersDTO;
import com.allala.Service.NewsServiceDAO;
import com.allala.Service.UserServiceDAO;
import com.allala.Service.Impl.NewsService;

@Controller
public class Appcontroller {
	@Autowired
	UserServiceDAO userService;
	@Autowired
	NewsServiceDAO newsservice;
	@RequestMapping(value="/")
		public ModelAndView getMyRoot(){
			ModelAndView mav = new ModelAndView("index");
			return mav;				
	}
	
	
	@RequestMapping(value="/index")
	public ModelAndView getMyindex(){
		ModelAndView mav = new ModelAndView("index");
		return mav;				
}
	
	@RequestMapping(value="/around")
	public ModelAndView getMyAround(){
		ModelAndView mav = new ModelAndView("around");
		return mav;				
	}
	
	@Secured(value = {"ROLE_PERSON"})
	@RequestMapping(value="/local_news_index")
	public ModelAndView postNews(){
		ModelAndView mav = new ModelAndView("local_news_index");
		return mav.addObject("news",newsservice.getAllNews());				
	}
	@Secured(value = {"ROLE_PERSON"})
	@RequestMapping(value="/local_news_location")
	public ModelAndView getpostsByloc(){
		ModelAndView mav = new ModelAndView("local_news_location");
		//for(Long l :newsservice.getAllzips()){
		// return mav.addObject("news",newsservice.getNewsByloc(39560));
		//}
		
		return mav;
	}
	@Secured(value = {"ROLE_PERSON"})
	@RequestMapping(value="/local_news_allnews")
	public ModelAndView getYourPosts(Principal p){
		String username = p.getName();
		ModelAndView mav = new ModelAndView("local_news_allnews");
		return mav.addObject("news",userService.getAllNewsByUser(username));				
	}
	
	@Secured(value = {"ROLE_PERSON"})
	@RequestMapping(value="/postnews",method= {RequestMethod.GET})
	public ModelAndView getMylocalNews(){
		return new ModelAndView("local_news","command",new NewsDTO());						
	}
	@Secured(value = {"ROLE_PERSON"})
	@RequestMapping(value="/local_news_index",method= {RequestMethod.POST})
	public ModelAndView postMylocalNews(@ModelAttribute("newsDTO") NewsDTO newsDTO,Principal principal){
		String uname = principal.getName();	
		newsservice.addNews(newsDTO,uname);
		
		return new ModelAndView("local_news_index").addObject("news",newsservice.getAllNews());
	}
	@Secured(value = {"ROLE_PERSON"})
	@RequestMapping(value="/logout")
	public ModelAndView getOut(){
		ModelAndView mav = new ModelAndView("index");
		return mav;				
	}
	
	@RequestMapping(value="/signin")
	public ModelAndView getMySignin(){
		ModelAndView mav = new ModelAndView("signin");
		return mav;				
	}
	
	@RequestMapping(value="/signup",method= {RequestMethod.GET})
	public ModelAndView getMysignup(){
		return new ModelAndView("signup","command",new UsersDTO());
						
	}
	
	@RequestMapping(value="/logout",method= {RequestMethod.GET})
	public ModelAndView getLogout(){
		return new ModelAndView("signin");
						
	}
	
	@RequestMapping(value="/aftersinup",method= {RequestMethod.POST})
	public ModelAndView userSignup(@ModelAttribute("usersDTO") UsersDTO usersDTO){
		
		/*List<String> s = userService.getAllUserNames();
		for(String i :s){
			if(i.equals(usersDTO.getUsername())){
				return new ModelAndView("singup","error","User Already Exists !!");
			}
		}*/
		/*
		if(usersDTO.getPassword().length()!=5){
			return new ModelAndView("signup","error","Password Must be Min 5 charatcers !!");
		}*/
		
		userService.persistUsersDTO(usersDTO);
		return new ModelAndView("aftersinup");				
	}

}
