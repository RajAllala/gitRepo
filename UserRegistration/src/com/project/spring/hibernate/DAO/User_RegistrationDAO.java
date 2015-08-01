package com.project.spring.hibernate.DAO;

public interface User_RegistrationDAO {
	
	public void sendMailIdAndHash(Long id, String registration_hash_code);

}
