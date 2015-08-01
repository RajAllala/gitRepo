package com.teama.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;

import com.teama.DAO.DocumentDAO;
import com.teama.entities.Docs_employee;
import com.teama.entities.Docs_student;
import com.teama.service.DocumentService;

@Transactional
@Service
public class DocumentServiceImpl implements DocumentService {

	
	@Autowired
	private DocumentDAO documentDAO;
	
	@Override
	public String PersistDocument(String uploaded_by, byte[] data,
			String doc_name, String content_type, Long size, String usertype) {
		// TODO Auto-generated method stub
		return documentDAO.PersistDocument(uploaded_by, data, doc_name,content_type,size,usertype);
	}

	@Override
	public List<Docs_student> getallDocs() {
		// TODO Auto-generated method stub
		return documentDAO.getallDocs();
	}

	@Override
	public Docs_student getDocbyId(Long id) {
		// TODO Auto-generated method stub
		return documentDAO.getDocById(id);
		
		
	}

	@Override
	public List<Docs_employee> getallempDocs() {
		// TODO Auto-generated method stub
		return documentDAO.getallempDocs();
	}

	@Override
	public Docs_employee getempDocById(Long id) {
		// TODO Auto-generated method stub
		return documentDAO.getempDocById(id);
	}

	@Override
	public List<Docs_student> getdocs(String usertype) {
		// TODO Auto-generated method stub
		return documentDAO.getdocs(usertype);
	}

}
