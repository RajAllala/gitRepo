package com.teama.service;

import java.util.List;

import com.teama.DTO.AuthorityDTO;
import com.teama.DTO.New_User_DTO;
import com.teama.DTO.employeeDTO;
import com.teama.entities.User_info;

public interface UserService {
	
	public User_info getProfile(String username);
	public List<User_info> getallUsers(); 
	public void persistAuthority(AuthorityDTO dto);
	public String getusertype(String usertype);
	public List<User_info> getTechUsers(String techtype);
	public int verifyUserEmail(String email);
	public void persistUserDTO(New_User_DTO userdto);
	public List<employeeDTO> getEmpUsers();
	

}
