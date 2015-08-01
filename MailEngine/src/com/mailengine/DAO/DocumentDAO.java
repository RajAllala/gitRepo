package com.mailengine.DAO;


import java.util.Date;

import com.mailengine.entities.Document_Info;

public interface DocumentDAO {

	public void persistDoc(byte[] b, Document_Info doc_info);
	
	public void persistDocument(byte[] b,String filename,String uploaded_by,Date uploaded_date,String ext,int size);
	public void goIndex(String id);
	public void pushDataTomailDB(Document_Info doc_info);
	public boolean verifyUser(String email);

}
