package com.teama.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.teama.Bean.Stat;
import com.teama.DAO.ForumDao;
import com.teama.DAO.UsersDAO;
import com.teama.DTO.AuthorityDTO;
import com.teama.DTO.VisaKey;
import com.teama.DTO.employeeDTO;
import com.teama.entities.Questions;
import com.teama.entities.User;
import com.teama.entities.User_info;
import com.teama.service.DashBoardService;






@RestController
@RequestMapping("/service/api")
public class MyRestController {
	@Autowired
	DashBoardService dashBoardService;
	@Autowired
	ForumDao forumDao;
	@Autowired
	UsersDAO usersDAO;
	
	
	@RequestMapping("/TechType/count")
	public List<Stat> getStatisticsByTechTypeCount(){
		return dashBoardService.getStatsByTechCount();
	}
	@RequestMapping("/VisakeyType/count")
	public VisaKey getStatisticsByVisakeyTypeCount(){
		VisaKey key = new VisaKey();
		key.setValues(dashBoardService.getStatsByVisaCount());
		return key;
	}
	@RequestMapping("/VisaType/count")
	public List<Stat> getStatisticsByVisaTypeCount(){
		return dashBoardService.getStatsByVisaCount();
	}
	
	@RequestMapping("/UnivType/count")
	public List<Stat> getStatisticsByUnivTypeCount(){
		return dashBoardService.getStatsByUnivCount();
	}
	@RequestMapping("/UserType/count")
	public List<Stat> getStatisticsByUserTypeCount(){
		return dashBoardService.getStatsByUserTypeCount();
	}
	@RequestMapping("/EmpLocType/count")
	public List<Stat> getStatisticsByEmpLocTypeCount(){
		return dashBoardService.getStatsByEmpLocTypeCount();
	}
	@RequestMapping("/questions")
	public List<Questions> getques(){
		return forumDao.getAllQuestions();
	}
   @RequestMapping("/users")
   public List<User_info> getusers(){
		return usersDAO.Allusers();
	}
   @RequestMapping("/empusers")
   public List<employeeDTO> getempusers(){
		return usersDAO.getEmpUsers();
	}
}







