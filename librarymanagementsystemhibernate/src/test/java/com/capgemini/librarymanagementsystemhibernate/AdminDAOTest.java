package com.capgemini.librarymanagementsystemhibernate;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.librarymanagementsystemhibernate.dao.AdminDAO;
import com.capgemini.librarymanagementsystemhibernate.dto.BookBean;


public class AdminDAOTest {
	
	@Autowired
	private AdminDAO dao;
	
	@Test
	public void testAddBookValid() {
		BookBean bean = new BookBean();
		bean.setBook_title("Java");
		bean.setAuthor("James");
		bean.setCategory("Programing");
		bean.setBook_publisher("Arihent");
		boolean check = dao.addBook(bean);
		Assertions.assertTrue(check);
	}
	@Test
	public void testAddBookInvalid() {
		BookBean bean = new BookBean();
		bean.setBook_title("Java");
		bean.setAuthor("James");
		bean.setCategory("Programing");
		bean.setBook_publisher("Arihent");
		boolean check = dao.addBook(bean);
		Assertions.assertFalse(check);	
	} 
	

	
	
	@Test
	public void testUpdateBookValid() {
		BookBean book = new BookBean();
		book.setBid(104);
		book.setBook_title("Maths");
		boolean check = dao.update(book);
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testUpdateBookInvalid() {
		BookBean book = new BookBean();
		book.setBid(109);
		book.setBook_title("Maths");
		boolean check = dao.update(book);
		Assertions.assertFalse(check);
	}
	
	@Test
	public void testIssueBookValid() {
		boolean check = dao.issueBook(105, 100002);
		Assertions.assertTrue(check);
	}
	
	@Test
	public void testIssueBookInvalid() {
		boolean check = dao.issueBook(109, 100002);
		Assertions.assertFalse(check);
	}
	

	
	
}
