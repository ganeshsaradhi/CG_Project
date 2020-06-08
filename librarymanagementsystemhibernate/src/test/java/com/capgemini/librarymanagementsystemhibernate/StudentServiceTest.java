package com.capgemini.librarymanagementsystemhibernate;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.librarymanagementsystemhibernate.service.StudentService;

public class StudentServiceTest {
	@Autowired
private StudentService service ;
	
	@Test
	public void testRequestValid() {
		boolean check = service.req(100002, 105);
		Assertions.assertTrue(check);		
	}
	
	@Test
	public void testRequestInvalid() {
		boolean check = service.req(100002, 109);
		Assertions.assertFalse(check);		
	}
	
	
	

	



}
