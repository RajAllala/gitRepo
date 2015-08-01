package com.teama.DAO;

import java.util.List;

import com.teama.entities.Docs_employee;
import com.teama.entities.Docs_student;

public interface DocumentDAO {

	
	public String PersistDocument(String uploaded_by, byte[] data,
			String doc_name, String content_type, Long size,String usertype);
	
	public List<Docs_student> getallDocs();
	
	public Docs_student getDocById(Long id);
	
public List<Docs_employee> getallempDocs();
	
	public Docs_employee getempDocById(Long id);
	
	public List<Docs_student> getdocs(String usertype);
	
}
