package com.teama.service;

import java.util.List;

import com.teama.entities.Docs_employee;
import com.teama.entities.Docs_student;
import com.teama.entities.User_info;

public interface DocumentService {
	
	public String PersistDocument(String uploaded_by, byte[] data,
			String doc_name, String content_type, Long size, String usertype);
	
	
	public List<Docs_student> getallDocs();
	public Docs_student getDocbyId(Long id);
	
public List<Docs_employee> getallempDocs();
	
	public Docs_employee getempDocById(Long id);
	public List<Docs_student> getdocs(String usertype);

}
