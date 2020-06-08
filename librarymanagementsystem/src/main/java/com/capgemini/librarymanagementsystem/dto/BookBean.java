package com.capgemini.librarymanagementsystem.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BookBean implements Serializable {
	private String name;
	private int id;
	private String author;
	private String category;
	private String publishername;
	
	public BookBean() {
		// TODO Auto-generated constructor stub
	}
	
	public BookBean(int id,String name,String author,
			String publication,String category) {
		this.id=id;
		this.name=name;
		this.author=author;
		
		this.category=category;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPublishername() {
		return publishername;
	}
	public void setPublishername(String publishername) {
		this.publishername = publishername;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
