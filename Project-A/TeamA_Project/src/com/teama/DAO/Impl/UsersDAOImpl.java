package com.teama.DAO.Impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;






import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teama.DAO.UsersDAO;
import com.teama.DTO.AuthorityDTO;
import com.teama.DTO.New_User_DTO;
import com.teama.DTO.employeeDTO;
import com.teama.entities.Authorities;
import com.teama.entities.EmployeeDetails;
import com.teama.entities.New_registration;
import com.teama.entities.User_info;

@Repository
public class UsersDAOImpl  implements UsersDAO{

	@Autowired
	private HibernateTemplate hTemplate;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	 
	
	
	
	@Override
	public User_info getProfile(String username) {
		// TODO Auto-generated method stub
		return (User_info) hTemplate.findByNamedQueryAndNamedParam("getProfile","username", username).get(0);
		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User_info> Allusers() {
		// TODO Auto-generated method stub
		return hTemplate.loadAll(User_info.class);
	}

	@Override
	@Transactional
	public void persistAuthority(AuthorityDTO dto) {
		// TODO Auto-generated method stub
	Authorities auth = new Authorities();
	auth.setUser_role(dto.getAuthority());
	auth.setUsername(dto.getUsername());
	hTemplate.save(auth);
	sendRegMail(auth.getUsername());
	
	}
	
	@Override
	public void sendRegMail(String email){
		
		HttpClient httpClient = new DefaultHttpClient();
	    try {
	      HttpGet httpGetRequest = new HttpGet("http://localhost:8080/UserRegistration/service/email/"+email);
	      HttpResponse httpResponse = httpClient.execute(httpGetRequest);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
		
	}
	
	
	
	@Override
	@Transactional
	public String usertype(String username) {
		// TODO Auto-generated method stub
		return  (String) hTemplate.findByNamedQueryAndNamedParam("getusertype", "username", username).get(0).toString();
	}

	@Override

	

	@Transactional
	public List<User_info> getTechUsers(String techtype) {

		// TODO Auto-generated method stub
		return (List<User_info>) hTemplate.findByNamedQueryAndNamedParam("getTechTypeUsers", "tech_type", techtype);
		//return hTemplate.getSessionFactory().getCurrentSession().getNamedQuery("getTechTypeUsers").list();
	
	}

	@Override
	@Transactional
	public int verifyUserEmail(String email) {
		// TODO Auto-generated method stub
		//hTemplate.sessionFactory.getCurrentSession().createSQLQuery("select id from docxchange_new_user_registration where registration_hash_code=\'"+hash+"\'").uniqueResult();
		String emailid = (String) hTemplate.getSessionFactory().getCurrentSession().createSQLQuery(
				"select username from users where username=\'"+email+"\'").uniqueResult();
		System.out.println(emailid);
		if(emailid!=null){
			return 1;
		}
		
		else{
		String authEmailId = (String) hTemplate.getSessionFactory().getCurrentSession().createSQLQuery(
				"select username from authorities where username=\'"+email+"\'").uniqueResult();
		System.out.println(authEmailId);
			if(authEmailId!=null){
				return 2;
			}
			else{
				return 0;
			}
		}	
	}

	@Override
	@Transactional
	public void persistUser(New_User_DTO userdto) {
		// TODO Auto-generated method stub
		
		New_registration newuser = new New_registration();
		
		String datestring = userdto.getDob();
		DateFormat format = new SimpleDateFormat("yyyy-mm-dd");
		Date date = null;
		
		try {
			date = format.parse(datestring);
		} catch (ParseException e) {
			System.out.println("Unable to parse Date");
		}
		
		
		newuser.setAddress(userdto.getAddress());
		newuser.setCity(userdto.getCity());
		newuser.setCountry(userdto.getCountry());
		newuser.setDegree(userdto.getDegree());
		newuser.setDob(date);
		newuser.setEmail_id(userdto.getEmail_id());
		newuser.setFirst_name(userdto.getFirst_name());
		newuser.setLast_name(userdto.getLast_name());
		newuser.setPassword(userdto.getPassword());
		newuser.setPhone_number(userdto.getPhone_number());
		newuser.setState(userdto.getState());
		newuser.setTech_type(userdto.getTech_type());
		newuser.setUniversity(userdto.getUniversity());
		newuser.setVisa_status(userdto.getVisa_status());
		newuser.setZip(userdto.getZip());
		newuser.setMd5hash(userdto.getMd5hash());
		
		Session session = hTemplate.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(newuser);
		session.getTransaction().commit();
		session.close();
		
		sendRegConfirm(newuser.getId(),newuser.getMd5hash());
		
	}	
	
	
	public void sendRegConfirm(Long id, String hash){
		HttpClient httpClient = new DefaultHttpClient();
	    try {
	      HttpGet httpGetRequest = new HttpGet("http://192.168.1.93:8080/UserRegistration/service/email/"+id+"/"+hash);
	      HttpResponse httpResponse = httpClient.execute(httpGetRequest);
	    }catch(Exception e){
	    	e.printStackTrace();
	    }
	
	}
@Transactional
	@Override
	public List<employeeDTO> getEmpUsers() {
		// TODO Auto-generated method stub
		List<User_info> userInfo=(List<User_info>) hTemplate.getSessionFactory().getCurrentSession().getNamedQuery("empuserinfo").list();

		//for(User_info user in )

		List<EmployeeDetails> empInfo= hTemplate.loadAll(EmployeeDetails.class);
		List<employeeDTO> emparray = new ArrayList();
		int i=0;
		for(User_info user :userInfo ){
			employeeDTO employee= new employeeDTO();
			employee.setId(user.getId());
			employee.setFirst_name(user.getLast_name());
			employee.setLast_name(user.getLast_name());
			employee.setAddress(user.getAddress());
			employee.setCity(user.getCity());
			employee.setState(user.getState());
			employee.setCountry(user.getCountry());
			employee.setZip(user.getZip());
			employee.setPhone_number(user.getPhone_number());
			employee.setVisa_status(user.getVisa_status());
			employee.setUniversity(user.getUniversity());
			employee.setDegree(user.getDegree());
			employee.setTech_type(user.getTech_type());
			employee.setUsername(user.getUsername());
			employee.setEmp_email(empInfo.get(i).getUser_email());
			employee.setClient_name(empInfo.get(i).getClient_name());
			employee.setClient_address(empInfo.get(i).getClient_address());
			employee.setClient_city(empInfo.get(i).getCity());
			employee.setClient_state(empInfo.get(i).getState());
			employee.setClient_country(empInfo.get(i).getCountry());
			employee.setClient_zip(empInfo.get(i).getZip());
			employee.setEmp_workphone(empInfo.get(i).getWorkphone());
			employee.setLcupdate_date(empInfo.get(i).getLcupdate_date());
			employee.setVisa_start_date(empInfo.get(i).getVisa_start_date());
			employee.setVisa_end_date(empInfo.get(i).getVisa_end_date());
			emparray.add(employee);
			i++;
			
		}
		return emparray;
	}

}
