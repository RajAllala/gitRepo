package com.teama.service.Impl;

import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teama.DAO.UsersDAO;
import com.teama.DTO.AuthorityDTO;
import com.teama.DTO.New_User_DTO;
import com.teama.DTO.employeeDTO;
import com.teama.entities.User_info;
import com.teama.service.UserService;

@Service
@Transactional
public class UserserviceImpl implements UserService {

	@Autowired
	private UsersDAO usersDAO;
	
	@Override
	@Transactional
	public User_info getProfile(String username) {
		// TODO Auto-generated method stub
		return usersDAO.getProfile(username);
	}

	@Override
	@Transactional
	public List<User_info> getallUsers() {
		// TODO Auto-generated method stub
		System.out.println(" calling  GET ALL USERS >>>>>>>>. in service..");
		return usersDAO.Allusers();
	}

	@Override
	@Transactional
	public void persistAuthority(AuthorityDTO dto) {
		// TODO Auto-generated method stub
		usersDAO.persistAuthority(dto);
		
	}
	@Override
	@Transactional
	public String getusertype(String username) {
		// TODO Auto-generated method stub
		return usersDAO.usertype(username);
	}

	@Override
	@Transactional
	public List<User_info> getTechUsers(String techtype) {
		// TODO Auto-generated method stub
		return usersDAO.getTechUsers(techtype);
	}

	@Override
	public int verifyUserEmail(String email) {
		// TODO Auto-generated method stub
		
		return usersDAO.verifyUserEmail(email);
		
	}

	@Override
	public void persistUserDTO(New_User_DTO userdto) {
		// TODO Auto-generated method stub
		String hashing = userdto.getEmail_id()+System.currentTimeMillis();
		  userdto.setMd5hash(DigestUtils.md5Hex(hashing));     
		
		
		 usersDAO.persistUser(userdto);
	}
    @Transactional
	@Override
	public List<employeeDTO> getEmpUsers() {
		// TODO Auto-generated method stub
		return usersDAO.getEmpUsers();
	}

}
