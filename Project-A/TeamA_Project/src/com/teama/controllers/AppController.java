package com.teama.controllers;

import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.lucene.queryparser.classic.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.teama.DTO.AnswersDTO;
import com.teama.DTO.New_User_DTO;
import com.teama.DTO.QuestionsDTO;
import com.teama.DTO.VerifyEmailDTO;
import com.teama.LuceneService.LuceneService;
import com.teama.entities.Docs_student;
import com.teama.entities.User_info;
import com.teama.service.DocumentService;
import com.teama.service.ForumService;
import com.teama.service.UserService;


@Controller
public class AppController {
	private static final String ACTIVE_CLASS="class=\"active\"";
	
	//private static final Logger LOGGER = Logger.getLogger(AppController.class);
	
	@Autowired
	private UserService userservice;
	@Autowired
	private ForumService forumService;
	
	@Autowired
	private DocumentService documentservice;
	
	@Autowired
	private LuceneService luceneservice;
	
	@RequestMapping("/signin")
	public ModelAndView getsigninform(){
			return new ModelAndView("signin");
	}
	
	@RequestMapping("/Questions")
	public ModelAndView getQ(){
			//return new ModelAndView("Questions").addObject("Questions", ACTIVE_CLASS);
		System.out.println(forumService.getAllQuestions().get(0));
			return new ModelAndView("Questions","questions",forumService.getAllQuestions()).addObject("Questions", ACTIVE_CLASS);
	}
	
	
	@RequestMapping("/home")
	public ModelAndView getindexnform(){
			return new ModelAndView("index");
		
	}
	


	@RequestMapping("/upload")
	public ModelAndView getupload()
	{
		return new ModelAndView("upload").addObject("upload", ACTIVE_CLASS);
	}

	@RequestMapping(value="/",method = {RequestMethod.GET})
	public ModelAndView getlandForm(){
		return new ModelAndView("land","command",new VerifyEmailDTO());
	
	
	}
	
	

	@RequestMapping(value="/",method = {RequestMethod.POST})
	public ModelAndView getAppropriateForm(@ModelAttribute("land") VerifyEmailDTO verifyEmailDTO){
		
		int num = userservice.verifyUserEmail(verifyEmailDTO.getEmail());
		
		if(num == 1){
		return new ModelAndView("signin");
		}
		if(num == 2){
			
			return getAddPersonScreen(verifyEmailDTO.getEmail());
		}
		else{
			return new ModelAndView("contact");
		}
	}
	
	
	@RequestMapping(value="/contact",method = {RequestMethod.GET})
	public ModelAndView getContact(){
		
		return new ModelAndView("contact","command",new VerifyEmailDTO());
	
	
	}
	
	
	@RequestMapping(value="/registration",method = {RequestMethod.GET})
	public ModelAndView getAddPersonScreen(String emailid){
		New_User_DTO n =	new New_User_DTO();
		n.setEmail_id(emailid);
		return new ModelAndView("registration","command",n);
	}
	
	@RequestMapping(value="/registration",method = {RequestMethod.POST})
	public ModelAndView addPerson(@ModelAttribute("registration") New_User_DTO userdto){
		
		userservice.persistUserDTO(userdto);
		return new ModelAndView("signin");
	}
	
	@RequestMapping(value="/viewquestion/{id}",method = {RequestMethod.POST})
	public ModelAndView getviewquestionScreen(@ModelAttribute("answer") AnswersDTO answerDto, @PathVariable Long id, Principal principal){
	String user=principal.getName();
	String answer= answerDto.getAnswerText();
	forumService.persistAnswer(answer, id, user);;
	return new ModelAndView("viewquestion");
	}
	
	@RequestMapping(value="/viewquestion/{id}",method = {RequestMethod.GET})
	public ModelAndView getviewquestionScreen(@PathVariable Long id){
	return new ModelAndView("viewquestion","command",new AnswersDTO()).addObject("question", forumService.getQuestion(id))
	.addObject("answers", forumService.getAnsforQuestion(id));
	}
	
	
	@RequestMapping(value="/viewprofile",method ={RequestMethod.GET})
	public ModelAndView getviewprofile(Principal principal){
		
		System.out.println(userservice.getProfile(principal.getName()));
		
		ModelAndView mav = new ModelAndView("profile","profile",userservice.getProfile(principal.getName()));
		return mav;	
		//return new ModelAndView("profile");
	}
	
	@RequestMapping(value="/allusers",method ={RequestMethod.GET})
	@ResponseBody
	public List<User_info> getallusers(Principal principal){
		
		//System.out.println(userservice.getallUsers());
		
		//ModelAndView mav = new ModelAndView("viewprofile","profile",userservice.getallUsers());
		System.out.println(" calling  GET ALL USERS");
		
		return  userservice.getallUsers();
	}
	
	
	
	@RequestMapping(value="/file/upload",method = RequestMethod.POST)
	public void getUploadedFile(MultipartHttpServletRequest  request, HttpServletResponse response,Principal principal) throws IOException, ParseException{
		
		MultipartFile file = request.getFile(request.getFileNames().next());
		
	
		System.out.println("FileUploaded >>>>>>>>>> "+file.getOriginalFilename()+ "  file size >>> " +file.getSize() + "file type" +file.getContentType() + "????" +file.getBytes());
		userservice.getusertype(principal.getName());
		
		documentservice.PersistDocument(principal.getName(), file.getBytes(), file.getOriginalFilename(),file.getContentType(),file.getSize(),userservice.getusertype(principal.getName()));
		
	}
	
	
	@RequestMapping(value = "/downloadfile/{fileId}")
    public void handleFileDownload(@PathVariable Long fileId, HttpServletResponse response) {
		
		Docs_student doc = documentservice.getDocbyId(fileId);
		response.setContentType(doc.getContent_type());
        response.setContentLengthLong(doc.getSize());
        response.setHeader("Content-Disposition","attachment; filename="+doc.getDoc_name());
        try{
            FileCopyUtils.copy(doc.getDoc(), response.getOutputStream());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

	@RequestMapping("/forum")
	public ModelAndView gethome(){
			return new ModelAndView("forum");
	}

	
	@RequestMapping("/alldocuments")
	public ModelAndView getalldocuments()
	{
		
		ModelAndView mav = new ModelAndView("alldocuments","alldocuments",documentservice.getallDocs());
		return mav;		
	}
	
	@RequestMapping("/land")
	public ModelAndView getLandPage()
	{
		
		ModelAndView mav = new ModelAndView("land");
		return mav;		
	}
	
	@RequestMapping("/trainer")
	public ModelAndView getresumes(Principal principal)
	{
		
		String usertype = userservice.getusertype(principal.getName());
		ModelAndView mav = new ModelAndView("trainer","student",userservice.getTechUsers(usertype)).addObject("trainer", ACTIVE_CLASS);
		return mav;	
		
		
		
	}
	
	@RequestMapping("/user")
	public ModelAndView getuserdetails(Principal principal)
	{
		
		String usertype = userservice.getusertype(principal.getName());		
		
		System.out.println(userservice.getProfile(principal.getName()));
		ModelAndView mav = new ModelAndView("user","users",userservice.getProfile(principal.getName())).addObject("user", ACTIVE_CLASS);
		
		return mav;	
		
		
		//return new ModelAndView("forum");
	}
	
	
	
	@RequestMapping(value="/askquestions", method={RequestMethod.GET})
	public ModelAndView getMyStuffForQuestion(Principal principal){
	String user=principal.getName();
	return new ModelAndView("askquestion","command", new QuestionsDTO());
	}
	
	
	@RequestMapping(value="/askquestions", method={RequestMethod.POST})
	public ModelAndView addQuestion(@ModelAttribute("question") QuestionsDTO questionsDto, Principal principal) throws IOException{
	String user=principal.getName();
	String question= questionsDto.getQuestionText();
	
	luceneservice.LucenceService(question, user);
	//usersService.persistQuestion(question, user);
	return new ModelAndView("upload");
	}
	
	
	@RequestMapping("/trainer_sendmails")
	public ModelAndView getTrainerMail(){
			return new ModelAndView("trainer_sendmails").addObject("trainer_sendmails", ACTIVE_CLASS);
		
	}
	
	@RequestMapping("/trainerreview_docs")
	public ModelAndView getTrainerDocs(Principal principal){
		System.out.println(principal.getName());
		System.out.println(userservice.getusertype(principal.getName()));
			return new ModelAndView("trainerreview_docs","docs",documentservice.getdocs(userservice.getusertype(principal.getName()))).addObject("trainerreview_docs", ACTIVE_CLASS);
		
	}
	
	
	@RequestMapping("/trainer/files")
	public ModelAndView trainerdocs(Principal principal)
	{
		
		ModelAndView mav = new ModelAndView("reports","docs",documentservice.getdocs(userservice.getusertype(principal.getName())));
		return mav;
	}
	
	
	
}
