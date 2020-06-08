package com.capgemini.librarymanagementsystemjdbc.controller;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.ValidationException;

import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;
import com.capgemini.librarymanagementsystemjdbc.factory.StudentFactory;
import com.capgemini.librarymanagementsystemjdbc.service.StudentService;
import com.capgemini.librarymanagementsystemjdbc.validation.ValidationAdminStudent;

public class Student {
	public static void student() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		StudentService service2 = StudentFactory.getStudentService();
		do {
			try {
				System.out.println("*****************************Welcome to STUDENT PAGE****************************");
				System.out.println("Press 1 to Search the Book by Author");
				System.out.println("Press 2 to Search the Book by Title");
				System.out.println("Press 3 to Search the Book by Id");
				System.out.println("Press 4 to Get the Book Id's");
				System.out.println("Press 5 to Get the Book Information");
				System.out.println("Press 6 to reqReturn book");
				System.out.println("Press 7 to request book");
				System.out.println("Press 8 to main");
				boolean flag = false;
				ValidationAdminStudent validation = new ValidationAdminStudent();
				int bookId = 0;
				String bookAuthor = null;
				String bookName = null;
				int choice2 = scanner.nextInt();
				switch (choice2) {
				case 1:
					do {
						try {
							System.out.println("Enter Author :");
							bookAuthor = scanner.next();
							validation.validatedName(bookAuthor);
							flag = true;
						} catch (InputMismatchException e) {
							flag = false;
							System.err.println("Author Name should contains only Alphabates");
						} catch (ValidationException e) {
							flag = false;
							System.err.println(e.getMessage());
						}
					} while (!flag);
					BookBean bean4 = new BookBean();
					bean4.setAuthor(bookAuthor);
					BookBean searchByAuthor = service2.searchBookAuthor(bookAuthor);
					if (searchByAuthor != null) {
						System.out.println(searchByAuthor.getBid());
						System.out.println(searchByAuthor.getBook_title());
						System.out.println(searchByAuthor.getCategory());
						System.out.println(searchByAuthor.getAuthor());
						System.out.println(searchByAuthor.getCopies());
						System.out.println(searchByAuthor.getBook_publisher());
						System.out.println(searchByAuthor.getPublisher_name());
						System.out.println(searchByAuthor.getISBN());
						System.out.println(searchByAuthor.getCopyright_year());
						System.out.println(searchByAuthor.getStatus());
						System.out.println(searchByAuthor);
					} else {
						System.out.println("Book Not Found");
					}

					break;
				case 2:
					do {
						try {
							System.out.println("Enter Book Name :");
							bookName = scanner.next();
							validation.validatedName(bookName);
							flag = true;
						} catch (InputMismatchException e) {
							flag = false;
							System.err.println("Book-Name should contains only Alphabates");
						} catch (ValidationException e) {
							flag = false;
							System.err.println(e.getMessage());
						}
					} while (!flag);
					BookBean bean3 = new BookBean();
					bean3.setBook_title(bookName);
					BookBean searchByName = service2.searchBookTitle(bookName);
					if (searchByName != null) {
						System.out.println();
						System.out.println(searchByName.getBid());
						System.out.println(searchByName.getBook_title());
						System.out.println(searchByName.getCategory());
						System.out.println(searchByName.getAuthor());
						System.out.println(searchByName.getCopies());
						System.out.println(searchByName.getBook_publisher());
						System.out.println(searchByName.getPublisher_name());
						System.out.println(searchByName.getISBN());
						System.out.println(searchByName.getCopyright_year());
						System.out.println(searchByName.getStatus());

						System.out.println(searchByName);
					} else {
						System.out.println("Book Not Found");
					}
					break;
				case 3:
					do {

						System.out.println("Enter ID :");
						String bookId1 = scanner.next();
						try {
							bookId = Integer.parseInt(bookId1);
							flag = true;
						} catch (Exception e) {
							flag = false;
							System.err.println("Id should contains only digits");
						}

					} while (!flag);
					BookBean bean5 = new BookBean();
					bean5.setBid(bookId);
					BookBean searchById = service2.searchBookType(bookId);
					if (searchById != null) {
						System.out.println(searchById.getBid());
						System.out.println(searchById.getBook_title());
						System.out.println(searchById.getCategory());
						System.out.println(searchById.getAuthor());
						System.out.println(searchById.getCopies());
						System.out.println(searchById.getBook_publisher());
						System.out.println(searchById.getPublisher_name());
						System.out.println(searchById.getISBN());
						System.out.println(searchById.getCopyright_year());
						System.out.println(searchById.getStatus());
						System.out.println(searchById);
					} else {
						System.out.println("Book Not Found");
					}
					break;

				case 4:
					List<BookBean> ids = service2.getBookIds();
					for (BookBean integer : ids) {

						if (integer != null) {
							System.out.println(integer.getBid());
						} else {
							System.out.println("No Books Ids are available");
						}
					}
					break;
				case 5:
					List<BookBean> info = service2.getBooksInfo();
					for (BookBean bookBean : info) {

						if (bookBean != null) {
							System.out.println(bookBean);
						} else {
							System.out.println("Books info is not presernt");
						}
					}
					break;
				case 6:
					System.out.println("-----------------------");
					System.out.println("Enter User Id");
					int user1 = scanner.nextInt();
					System.out.println("Enter Book Id");
					int book1 = scanner.nextInt();

					boolean reqReturn = service2.reqReturnBook(user1, book1);
					if (reqReturn) {
						System.out.println(" Return Request placed");
					} else {
						System.out.println("Invalid ! Cannot place return request");
					}
					break;
				case 7:
					System.out.println("Enter the Book Id:");
					int reqBookId = scanner.nextInt();
					System.out.println("Enter the user Id:");
					int reqUserId = scanner.nextInt();
					boolean requested = service2.req(reqUserId, reqBookId);
					if (requested != false) {
						System.out.println("-----------------------------------------------");
						System.out.println("Book is Requested");
					} else {
						System.out.println("-----------------------------------------------");
						System.out.println("Book is not Requested");
					}

					break;
				case 8:
					User.doReg();
				default:
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid Credentials");
			}
			break;
		} while (true);
	}
}
