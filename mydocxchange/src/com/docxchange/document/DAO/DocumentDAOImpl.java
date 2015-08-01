package com.docxchange.document.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;

import com.docxchange.document.entities.Document;

public class DocumentDAOImpl implements DocumentDAO {

	@Autowired
	private HibernateTemplate hTemplate;
	@Override
	public Long persistDocs(Document Doc) {
		hTemplate.saveOrUpdate(Doc);
		return Doc.getFile_id();
	}

	@Override
	public Document getDocumentById(Long Document_id) {
		return (Document) hTemplate.findByNamedQueryAndNamedParam("nativeDocById", "file_id", Document_id);
	}

}
