package com.mailengine.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="docxchange_document_info")
public class Document_Info implements Serializable {

	private static final long serialVersionUID = 8039974259509936709L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(name = "uploaded_by")
	private String file_uploaded_by;
	@Column(name = "uploaded_date")
	private Date file_uploaded_date;
	@Column(name = "document_content_type")
	private String file_content_type;
	@Column(name = "document_name")
	private String file_name;
	@Column(name = "document_size")
	private int size;
	@Column(name="created_by")
	private String createdBy;
	@Column(name="created_date")
	private Date createdDate;
	@Column(name = "updated_by")
	private String updatedBy;
	@Column(name = "updated_date")
	private Date updatedDate;
	
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="document_id")
	private Document document;
	
	
	public Document_Info(){
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFile_uploaded_by() {
		return file_uploaded_by;
	}


	public void setFile_uploaded_by(String file_uploaded_by) {
		this.file_uploaded_by = file_uploaded_by;
	}


	public Date getFile_uploaded_date() {
		return file_uploaded_date;
	}


	public void setFile_uploaded_date(Date file_uploaded_date) {
		this.file_uploaded_date = file_uploaded_date;
	}


	public String getFile_content_type() {
		return file_content_type;
	}


	public void setFile_content_type(String file_content_type) {
		this.file_content_type = file_content_type;
	}


	public String getFile_name() {
		return file_name;
	}


	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int i) {
		this.size = i;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public Date getUpdatedDate() {
		return updatedDate;
	}


	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}


	public Document getDocument() {
		return document;
	}


	public void setDocument(Document document) {
		this.document = document;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Document_Info(String file_uploaded_by, Date file_uploaded_date,
			String file_content_type, String file_name, int size,
			String createdBy, Date createdDate, String updatedBy,
			Date updatedDate, Document document) {
		super();
		this.file_uploaded_by = file_uploaded_by;
		this.file_uploaded_date = file_uploaded_date;
		this.file_content_type = file_content_type;
		this.file_name = file_name;
		this.size = size;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
		this.document = document;
	}


	@Override
	public String toString() {
		return "Document_Info [file_uploaded_by=" + file_uploaded_by
				+ ", file_uploaded_date=" + file_uploaded_date
				+ ", file_content_type=" + file_content_type + ", file_name="
				+ file_name + ", size=" + size + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", document=" + document
				+ "]";
	}	
	
	
}
