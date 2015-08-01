package com.mailengine.entities;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="DOCXCHANGE_DOCUMENT")

@NamedNativeQueries({
@NamedNativeQuery(name="nativeDocById", query="Select data from DOCXCHANGE_DOCUMENT where id = :id"),
@NamedNativeQuery(name="nativeDoc_infoById", query="Select document_name from docxchange_document_info where document_id = :document_id")

})
public class Document implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = -5688709167431345845L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="data")
	private byte[] fileData;
	
	
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="document",cascade=CascadeType.ALL )
	private Document_Info document_Info;
	/*private docxchange_mail_document mail_doc;*/
	
	
		
/*	public docxchange_mail_document getMail_doc() {
		return mail_doc;
	}

	public void setMail_doc(docxchange_mail_document mail_doc) {
		this.mail_doc = mail_doc;
	}*/

	public Document(){
		
	}

	public Document(byte[] fileData) {
		super();
		this.fileData = fileData;
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}

	public Document_Info getDocument_Info() {
		return document_Info;
	}

	public void setDocument_Info(Document_Info document_Info) {
		this.document_Info = document_Info;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
