package com.capgemini.librarymanagementsystemhibernate;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.librarymanagementsystemhibernate.dao.UserDAO;
import com.capgemini.librarymanagementsystemhibernate.dto.UserBean;

public class UserDAOTest {
	@Autowired
	private UserDAO dao;
	
	@Test
	public void testRegisterValid() {
		UserBean bean = new UserBean();
		bean.setName("Ganesh");
		bean.setName("ch");
		bean.setEmail("Ganesh@gmail.com");
		bean.setPassword("Ganesh@123");
		bean.setRole("student");
		boolean check = dao.register(bean);
		Assertions.assertTrue(check);		
	}
	
	@Test
	public void testRegisterInvalid() {
		UserBean bean = new UserBean();
		bean.setName("GANESH");
		bean.setName("CH");
		bean.setEmail("GANESH@gmail.com");
		bean.setPassword("GANESH@123");
		bean.setRole("student");
		boolean check = dao.register(bean);
		Assertions.assertFalse(check);
	}

	@Test
	public void testLoginValid() {
		UserBean info = dao.auth("ganesh@gmail.com", "ganesh");
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testLoginInvalid() {
		UserBean info = dao.auth("ganesh@gmail.com", "ganesh");
		Assertions.assertNull(info);
	}
	

	
}
