package com.capgemini.librarymanagementsystemhibernate;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.librarymanagementsystemhibernate.dao.StudentDAO;


public class StudentDAOTest {
	
	@Autowired
	private StudentDAO dao;
	
	@Test
	public void testRequestValid() {
		boolean check = dao.req(100002, 105);
		Assertions.assertTrue(check);		
	}
	
	@Test
	public void testRequestInvalid() {
		boolean check = dao.req(100002, 109);
		Assertions.assertFalse(check);		
	}
	


}
