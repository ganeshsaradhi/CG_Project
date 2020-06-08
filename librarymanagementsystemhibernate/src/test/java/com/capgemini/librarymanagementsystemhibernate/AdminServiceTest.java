package com.capgemini.librarymanagementsystemhibernate;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.librarymanagementsystemhibernate.dto.BookBean;


import com.capgemini.librarymanagementsystemhibernate.service.AdminService;

public class AdminServiceTest {
	@Autowired
private AdminService service;
	
	@Test
	public void testAddBookValid() {
		BookBean bean = new BookBean();
		bean.setBook_title("Java");
		bean.setAuthor("James");
		bean.setCategory("Programing");
		bean.setBook_publisher("Arihent");
		boolean check = service.addBook(bean);
		Assertions.assertTrue(check);
	}
	@Test
	public void testAddBookInvalid() {
		BookBean bean = new BookBean();
		bean.setBook_title("Java");
		bean.setAuthor("James");
		bean.setCategory("Programing");
		bean.setBook_publisher("Arihent");
		boolean check = service.addBook(bean);
		Assertions.assertFalse(check);	
	} 
	

	

	
	@Test
	public void testUpdateBookValid() {
		BookBean book = new BookBean();
		book.setBid(104);
		book.setBook_title("Maths");
		boolean check = service.update(book);
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testUpdateBookInvalid() {
		BookBean book = new BookBean();
		book.setBid(109);
		book.setBook_title("Maths");
		boolean check = service.update(book);
		Assertions.assertFalse(check);
	}
	
	@Test
	public void testIssueBookValid() {
		boolean check = service.issueBook(105, 100002);
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testIssueBookInvalid() {
		boolean check = service.issueBook(109, 100002);
		Assertions.assertFalse(check);
	}
	



}
