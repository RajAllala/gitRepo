package com.teama.controllers;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;




import com.teama.DTO.AuthorityDTO;
import com.teama.entities.Docs_employee;
import com.teama.entities.Docs_student;
import com.teama.entities.User_info;
import com.teama.service.DocumentService;
import com.teama.service.UserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	DocumentService docService;
	@Autowired
	private UserService userservice;
	
	
	private static final String ACTIVE_CLASS="class=\"active\"";

	@RequestMapping("/home")
	public ModelAndView getAdmin(){
			return new ModelAndView("admin");
	}
	
	
	@RequestMapping("/dashboard")
	public ModelAndView getDashboard(){
			return new ModelAndView("dashboard").addObject("dashboard", ACTIVE_CLASS);
	}
	
	@RequestMapping("/reports")
	public ModelAndView getReports(){
			return new ModelAndView("reports").addObject("reports", ACTIVE_CLASS);
	}
/*	@RequestMapping("/adduser")
	public ModelAndView addUser(){
			return new ModelAndView("adduser");
	}*/
	
	@RequestMapping(value="/adduser",method = {RequestMethod.GET})
	public ModelAndView getAddUser(){
		
		return new ModelAndView("adduser","command",new AuthorityDTO()).addObject("adduser", ACTIVE_CLASS);


	}
	@RequestMapping(value="/adduser",method = {RequestMethod.POST})
	public ModelAndView addUser(@ModelAttribute("adduser") AuthorityDTO authdto){
		userservice.persistAuthority(authdto);
		return new ModelAndView("notice");
	}
	
	@RequestMapping("/notice")
	public ModelAndView getNotice(){
			return new ModelAndView("notice").addObject("notice", ACTIVE_CLASS);
	}
	
	
	@RequestMapping("/admin_sendmails")
	public ModelAndView sendMails(){
			return new ModelAndView("admin_sendmails").addObject("admin_sendmails", ACTIVE_CLASS);
	}
	@RequestMapping("/review_docs")
	public ModelAndView reviewDocs(){
		
		
			return new ModelAndView("review_docs","docs",docService.getallDocs()).addObject("review_docs", ACTIVE_CLASS);
	}
	@RequestMapping("/employee_docs")
	public ModelAndView employeeDocs(){
		
		
			return new ModelAndView("employee_docs","docs",docService.getallempDocs()).addObject("employee_docs", ACTIVE_CLASS);
	}
	
	@RequestMapping(value = "/downloadfile/{fileId}")
    public void handleFileDownload(@PathVariable Long fileId, HttpServletResponse response) {
		Docs_student f = docService.getDocbyId(fileId);
        response.setContentType(f.getContent_type());
        response.setContentLengthLong(f.getSize());
        response.setHeader("Content-Disposition","attachment; filename="+f.getDoc_name());
        try{
            FileCopyUtils.copy(f.getDoc(), response.getOutputStream());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
	@RequestMapping(value = "/empdownloadfile/{fileId}")
    public void handleempFileDownload(@PathVariable Long fileId, HttpServletResponse response) {
		Docs_employee f = docService.getempDocById(fileId);
        response.setContentType(f.getContent_type());
        response.setContentLengthLong(f.getSize());
        response.setHeader("Content-Disposition","attachment; filename="+f.getDoc_name());
        try{
            FileCopyUtils.copy(f.getDoc(), response.getOutputStream());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
	@RequestMapping("/alluser")
	public ModelAndView allUsers(){
			return new ModelAndView("alluser");
	}
	
	
}
