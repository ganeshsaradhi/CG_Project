
package com.capgemini.librarymanagementsystemhibernate.controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.capgemini.librarymanagementsystemhibernate.dto.UserBean;
import com.capgemini.librarymanagementsystemhibernate.factory.UserFactory;
import com.capgemini.librarymanagementsystemhibernate.service.UserService;
import com.capgemini.librarymanagementsystemhibernate.validation.ValidationAdminStudent;

public class UserHib {
	@SuppressWarnings("resource")
	public static void doReg() {
		boolean flag = false;
		int regId1 = 0;
		String regName = null; 
		String regMobile = null;
		String regEmail = null;
		String regPassword = null;
		String regRole = null;
		ValidationAdminStudent validation = new ValidationAdminStudent();

	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("*********************Welcome to Library**********************");
		System.out.println("Press 1 to register");
		System.out.println("Press 2 to login");
		System.out.println("**************************************************************");
		UserService service1 = UserFactory.getUserService();

		int i = checkChoice();
		switch(i) {
		case 1:
			do {
				
				System.out.println("Enter ID :");
				String regId = scanner.next();
				try {
				regId1 = Integer.parseInt(regId);
				flag = true;
				} catch (Exception e) {
				flag = false;
				System.err.println("Id should contains only digits");
			} 
		
		}while (!flag);

		do {
			try {
				System.out.println("Enter Name :");
				regName = scanner.next();
				validation.validatedName(regName);
				flag = true;
			} catch (InputMismatchException e) {
				flag = false;
				System.err.println("Name should contains only Alphabates");
			} catch (javax.xml.bind.ValidationException e) {
				flag = false;
				System.err.println(e.getMessage());
			}
		} while (!flag);



		do {
			try {
				System.out.println("Enter Mobile :");
				regMobile = scanner.next();
				validation.validatedMobile(regMobile);
				flag = true;
			} catch (InputMismatchException e) {
				flag = false;
				System.err.println("Mobile Number  should contains only numbers");
			} catch (javax.xml.bind.ValidationException e) {
				flag = false;
				System.err.println(e.getMessage());
			}
		} while (!flag);



		do {
			try {
				System.out.println("Enter Email :");
				regEmail = scanner.next();
				validation.validatedEmail(regEmail);
				flag = true;
			} catch (InputMismatchException e) {
				flag = false;
				System.err.println("Email should be proper ");
			} catch (javax.xml.bind.ValidationException e) {
				flag = false;
				System.err.println(e.getMessage());
			}
		} while (!flag);



		do {
			try {
				System.out.println("Enter Password :");
				regPassword = scanner.next();
				validation.validatedPassword(regPassword);
				flag = true;
			} catch (InputMismatchException e) {
				flag = false;
				System.err.println("Enter correct Password ");
			} catch (javax.xml.bind.ValidationException e) {
				flag = false;
				System.err.println(e.getMessage());
			}
		} while (!flag);
		
		do {
			try {
				System.out.println("Enter Role :");
				regRole = scanner.next();
				validation.validatedRole(regRole);
				flag = true;
			} catch (InputMismatchException e) {
				flag = false;
				System.err.println("Enter correct Role ");
			} catch (javax.xml.bind.ValidationException e) {
				flag = false;
				System.err.println(e.getMessage());
			}
		} while (!flag);

		
		UserBean bean = new UserBean();
		bean.setId(regId1);
		bean.setName(regName);
		bean.setMobile(regMobile);
		bean.setEmail(regEmail);
		bean.setPassword(regPassword);
		bean.setRole(regRole);
				try {
				boolean check = service1.register(bean);
				if(check==false) {
					System.out.println("Email already exist");
				} else {
					System.out.println("Registered");
				}}catch(Exception e) {
				System.out.println("invalid");
				e.printStackTrace();
				}
				break;
			case 2:
				
				System.out.println("******************************************************");
				do {
					try {
						System.out.println("Enter Email :");
						regEmail = scanner.next();
						validation.validatedEmail(regEmail);
						flag = true;
					} catch (InputMismatchException e) {
						flag = false;
						System.err.println("Email should be proper with proper extension .com or .org");
					} catch (javax.xml.bind.ValidationException e) {
						flag = false;
						System.err.println(e.getMessage());
					}
				} while (!flag);
				
				do {
					try {
						System.out.println("Enter Password :");
						regPassword = scanner.next();
						validation.validatedPassword(regPassword);
						flag = true;
					} catch (InputMismatchException e) {
						flag = false;
						System.err.println("Enter correct Password ");
					} catch (javax.xml.bind.ValidationException e) {
						flag = false;
						System.err.println(e.getMessage());
					}
				} while (!flag);
				
				try {
					UserBean auth = service1.auth(regEmail, regPassword);
					  if(auth.getRole().equalsIgnoreCase("admin")) {
					  AdminHib.admin();
					  }else if(auth.getRole().equalsIgnoreCase("student")){ 
						  StudentHib.student();
					  }
				else {
					System.out.println("invalid email and password");
				}
				}catch(Exception e) {
					System.out.println("invalid credentials");
				}
				break;
				}
		}while(true);	
}
	public static int checkChoice() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		ValidationAdminStudent validation = new ValidationAdminStudent();
		String inputChoice = null;
		boolean flag = false;
		int choice = 0;
		do {
			try {
				inputChoice = scanner.next();
				validation.validateChoice(inputChoice);
				flag = true;
				choice = Integer.parseInt(inputChoice);
			} catch (InputMismatchException e) {
				flag = false;
				System.err.println("Invalid Choice, It should contails only digits");
			} catch (javax.xml.bind.ValidationException e) {
				flag = false;
				System.err.println(e.getMessage());
			}
		} while (!flag);
		return choice;
	}
				

				}

