package com.capgemini.librarymanagementsystemhibernate;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.librarymanagementsystemhibernate.dto.UserBean;
import com.capgemini.librarymanagementsystemhibernate.service.UserService;

public class UserServiceTest {
	@Autowired
private UserService service ;
	
	@Test
	public void testRegisterValid() {
		UserBean bean = new UserBean();
		bean.setName("ganesh");
		bean.setName("ch");
		bean.setEmail("ganesh@gmail.com");
		bean.setPassword("ganesh@123");
		bean.setRole("student");
		boolean check = service.register(bean);
		Assertions.assertTrue(check);		
	}
	
	@Test
	public void testRegisterInvalid() {
		UserBean bean = new UserBean();
		bean.setName("ganesh");
		bean.setName("ch");
		bean.setEmail("ganesh@gmail.com");
		bean.setPassword("ganesh@123");
		bean.setRole("student");
		boolean check = service.register(bean);
		Assertions.assertFalse(check);
	}

	@Test
	public void testLoginValid() {
		UserBean info = service.auth("ganesh@gmail.com", "ganesh@1");
		Assertions.assertNotNull(info);
	}
	
	@Test
	public void testLoginInvalid() {
		UserBean info = service.auth("ganesh@gmail.com", "ganesh@1");
		Assertions.assertNull(info);
	}



}
