package com.docxchange.document.DAO;

import com.docxchange.document.entities.Document;

public interface DocumentDAO {
	
	public Long persistDocs(Document Doc);
	public Document getDocumentById(Long Document_id);

}
