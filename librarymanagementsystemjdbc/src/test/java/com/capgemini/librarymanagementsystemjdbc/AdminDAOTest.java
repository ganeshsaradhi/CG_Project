package com.capgemini.librarymanagementsystemjdbc;

import java.util.List;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.capgemini.librarymanagementsystemjdbc.dao.AdminDAOImp;
import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;



public class AdminDAOTest {
	BookBean bean = new BookBean();
	AdminDAOImp dao = new AdminDAOImp();
	@Test
	public void testAddBook() {
		BookBean bean = new BookBean();
		bean.setBid(56);
		bean.setBook_title("mysql");
		bean.setAuthor("codd");
		bean.setBook_publisher("sun");
		bean.setCategory("sw");
		bean.setCopies(3);
		bean.setPublisher_name("sun");
		bean.setCopyright_year(1995);
		bean.setISBN(98765432);
		bean.setStatus("old");
		AdminDAOImp dao = new AdminDAOImp();
		boolean status = dao.addBook(bean);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testAddBook1() {
		BookBean bean = new BookBean();
		bean.setBid(56);
		bean.setBook_title("mysql");
		bean.setAuthor("codd");
		bean.setBook_publisher("sun");
		bean.setCategory("sw");
		bean.setCopies(3);
		bean.setPublisher_name("sun");
		bean.setCopyright_year(1995);
		bean.setISBN(98765432);
		bean.setStatus("old");
		AdminDAOImp dao = new AdminDAOImp();
		boolean status = dao.addBook(bean);
		Assertions.assertFalse(status);
	}
	
	@Test
	public void testUpdateBook() {
		bean.setBid(55);
		bean.setBook_title("java");
		boolean status = dao.update(bean);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testUpdateBook1() {
		bean.setBid(55);
		bean.setBook_title("java");
		boolean status = dao.update(bean);
		Assertions.assertFalse(status);
	}
	@Test
	public void testDeleteBook() {
		boolean status = dao.delete(55);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testDeleteBook1() {
		boolean status = dao.delete(55);
		Assertions.assertFalse(status);
	}
	
	@Test
	public void testSearchBookById() {
		//bean.setBid(56);
		BookBean bean1 = dao.searchBookType(56);
		Assertions.assertNotNull(bean1);
	}
	
	@Test
	public void testSearchBookById1() {
		BookBean bean1 = dao.searchBookType(55);
		Assertions.assertNotNull(bean1);
	}
	
	@Test
	public void testSearchBookByName() {
		BookBean bean1 = dao.searchBookTitle("mysql");
		Assertions.assertNotNull(bean1);
	}
	
	@Test
	public void testSearchBookByName1() {
		BookBean bean1 = dao.searchBookTitle("sql");
		Assertions.assertNotNull(bean1);
	}
	
	@Test
	public void testSearchBookByAuthor() {
		BookBean bean1 = dao.searchBookAuthor("codd");
		Assertions.assertNotNull(bean1);
	}
	
	@Test
	public void testSearchBookByAuthor1() {
		BookBean bean1 = dao.searchBookTitle("william");
		Assertions.assertNotNull(bean1);
	}
	
	@Test
	public void testIssueBook() {
		boolean status = dao.issueBook(56, 1);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testIssueBook1() {
		boolean status = dao.issueBook(56, 1);
		Assertions.assertFalse(status);
	}
	
	@Test
	public void testreturnBook() {
		boolean status = dao.returnBook(56, 1);
		Assertions.assertTrue(status);
	}
	
	@Test
	public void testReturnBook1() {
		boolean status = dao.returnBook(56, 1);
		Assertions.assertFalse(status);
	}
	
	@Test
	public void testGetId() {
		List<BookBean> bean1 = dao.getBookIds();
		Assertions.assertNotNull(bean1);
	}
	
	@Test
	public void testGetId1() {
		List<BookBean> bean1 = dao.getBookIds();
		Assertions.assertEquals(1, bean1.size());
	}
	
	@Test
	public void testGetInfo() {
		List<BookBean> bean1 = dao.getBooksInfo();
		Assertions.assertNotNull(bean1);
	}
	
	@Test
	public void testGetInfo1() {
		List<BookBean> bean1 = dao.getBooksInfo();
		Assertions.assertEquals(1, bean1.size());
	}
	
	
}