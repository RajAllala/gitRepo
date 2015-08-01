package com.docxchange.document.entities;

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
@Table(name="DOCUMENT")
@NamedNativeQueries({
	@NamedNativeQuery(name="nativeDocById", query="Select * from DOCUMENT where file_id = :file_id",resultClass=Document.class)
})
public class Document implements Serializable {

	/**
	 * 
	 */

	private static final long serialVersionUID = -5688709167431345845L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long file_id;
	@Lob
	@Column(name="file_data")
	private byte[] fileData;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="document",cascade=CascadeType.ALL )
	private Document_Info document_Info;
	
	
	public Document(){
		
	}
	
	
	
	public Document(byte[] fileData, Document_Info document_Info) {
		super();
		this.fileData = fileData;
		this.document_Info = document_Info;
	}



	public Long getFile_id() {
		return file_id;
	}

	public void setFile_id(Long file_id) {
		this.file_id = file_id;
	}

	public byte[] getFileData() {
		return fileData;
	}

	public void setFileData(byte[] fileData) {
		this.fileData = fileData;
	}



	@Override
	public String toString() {
		return "Document [fileData=" + Arrays.toString(fileData)
				+ ", document_Info=" + document_Info + "]";
	}

	
}
