package com.example;

import com.mysql.jdbc.Blob;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PDFDocument
 *
 */


public class PDFDocument implements Serializable {

	
	private long id;
	private Blob pdfdata;
	private String filename;
	private static final long serialVersionUID = 1L;

	public PDFDocument() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public Blob getPdfdata() {
		return this.pdfdata;
	}

	public void setPdfdata(Blob pdfdata) {
		this.pdfdata = pdfdata;
	}   
	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
   
}
