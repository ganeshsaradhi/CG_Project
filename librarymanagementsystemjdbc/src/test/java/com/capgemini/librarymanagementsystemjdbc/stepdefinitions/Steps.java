//package com.capgemini.librarymanagementsystemjdbc.stepdefinitions;
//
//import com.capgemini.librarymanagementsystemjdbc.dto.UserBean;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Steps {
//	UserBean bean;
//	@Given("^User is on register page$")
//	public void user_is_on_register_page() throws Throwable {
//		bean = new UserBean();
//	}
//
//	@When("^User gave (\\d+),\"([^\"]*)\",(\\d+),\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
//	public void user_gave(int arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
//		
//		bean.setEmail(arg2);
//		bean.setId(arg1);
//		bean.setMobile(arg3);
//		bean.setName(arg5);
//		bean.setPassword(arg6);
//		bean.setRole(arg4);
//	
//	}
//
//	@Then("^User should be \"([^\"]*)\"$")
//	public void user_should_be(String arg1) throws Throwable {
//	  
//	}
//
//
//}
