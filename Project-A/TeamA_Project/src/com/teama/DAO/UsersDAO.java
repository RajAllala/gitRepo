package com.teama.DAO;

import java.util.List;

import com.teama.DTO.AuthorityDTO;
import com.teama.DTO.New_User_DTO;
import com.teama.DTO.employeeDTO;
import com.teama.entities.User;
import com.teama.entities.User_info;

public interface UsersDAO {

	public User_info getProfile(String username);
	public List<User_info> Allusers();
	public void persistAuthority(AuthorityDTO dto);
	public String usertype(String username);
	 public List<User_info> getTechUsers(String techtype);
	void sendRegMail(String email);
	public int verifyUserEmail(String email);
	public void persistUser(New_User_DTO userdto);
	public List<employeeDTO> getEmpUsers();
}
