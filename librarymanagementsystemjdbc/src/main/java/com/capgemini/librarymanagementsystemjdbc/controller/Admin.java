package com.capgemini.librarymanagementsystemjdbc.controller;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.xml.bind.ValidationException;

import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;
import com.capgemini.librarymanagementsystemjdbc.factory.AdminFactory;
import com.capgemini.librarymanagementsystemjdbc.service.AdminService;
import com.capgemini.librarymanagementsystemjdbc.validation.ValidationAdminStudent;

public class Admin {
	public static void admin() {
		AdminService service = AdminFactory.getAdminService();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("*****************************Welcome to ADMIN PAGE****************************");
		System.out.println("Press 1 to Add Books");
		System.out.println("Press 2 to update");
		System.out.println("Press 3 for search");
		System.out.println("Press 4 to remove the Books");
		System.out.println("Press 5 to Get the Book Id's");
		System.out.println("Press 6 to Get the Book Information");
		System.out.println("Press 7 to issue book");
		System.out.println("Press 8 to return book");

		boolean flag = false;
		ValidationAdminStudent validation = new ValidationAdminStudent();
		int bookId = 0;
		String bookAuthor = null;
		String bookName = null;
		String bookCategory = null;
		String bookPublisherName = null;
		String bookPublisher = null;
		int ISBN = 0;
		String status = null;
		int copies = 0;
		int year = 0;
		int choice1 = scanner.nextInt();
		switch (choice1) {
		case 1:

			do {
				System.out.println("Enter ID :");
				String regId = scanner.next();
				try {
					bookId = Integer.parseInt(regId);
					flag = true;
				} catch (Exception e) {
					flag = false;
					System.err.println("Id should contains only digits");
				}

			} while (!flag);

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
			do {
				try {
					System.out.println("Enter Category :");
					bookCategory = scanner.next();
					validation.validatedName(bookCategory);
					flag = true;
				} catch (InputMismatchException e) {
					flag = false;
					System.err.println("Book-Category should contains only Alphabates");
				} catch (ValidationException e) {
					flag = false;
					System.err.println(e.getMessage());
				}
			} while (!flag);
			do {
				try {
					System.out.println("Enter PublisherName :");
					bookPublisherName = scanner.next();
					validation.validatedName(bookPublisherName);
					flag = true;
				} catch (InputMismatchException e) {
					flag = false;
					System.err.println("Book-PublisherName should contains only Alphabates");
				} catch (ValidationException e) {
					flag = false;
					System.err.println(e.getMessage());
				}
			} while (!flag);

			do {
				try {
					System.out.println("Enter BookPublisher :");
					bookPublisher = scanner.next();
					validation.validatedName(bookPublisher);
					flag = true;
				} catch (InputMismatchException e) {
					flag = false;
					System.err.println("Book-Publisher should contains only Alphabates");
				} catch (ValidationException e) {
					flag = false;
					System.err.println(e.getMessage());
				}
			} while (!flag);

			do {
				try {
					System.out.println("Enter Number Of Copies :");
					String copies1 = scanner.next();
						copies = Integer.parseInt(copies1);
						flag = true;
					} catch (Exception e) {
						System.err.println("Copies should contains only digits");
						flag=false;
					}

			} while (!flag);

			do {
				try {
					System.out.println("Enter ISBN :");
					String isbn = scanner.next();
					
						ISBN = Integer.parseInt(isbn);
						flag=true;

					} catch (Exception e) {
						flag = false;
						System.err.println("ISBN should contains only digits");

					}

				
			} while (!flag);

			do {
				try {
					System.out.println("Enter status :");
					status = scanner.next();
					validation.validatedStatus(status);
					flag = true;
				} catch (InputMismatchException e) {
					flag = false;
					System.err.println("Status can be only new or old");
				} catch (javax.xml.bind.ValidationException e) {
					flag = false;
					System.err.println(e.getMessage());
				}
			} while (!flag);

			do {
				try {
				System.out.println("Enter Copyright Year :");
				String copyrightYear = scanner.next();
				
					year = Integer.parseInt(copyrightYear);
					flag = true;
				} catch (Exception e) {
					flag = false;
					System.err.println("Id should contains only digits");
				}

			} while (!flag);
			BookBean bean2 = new BookBean();
			bean2.setBid(bookId);
			bean2.setBook_title(bookName);
			bean2.setCategory(bookCategory);
			bean2.setAuthor(bookAuthor);
			bean2.setCopies(copies);
			bean2.setBook_publisher(bookPublisher);
			bean2.setPublisher_name(bookPublisherName);
			bean2.setISBN(ISBN);
			bean2.setCopyright_year(year);
			bean2.setStatus(status);

			boolean bookAdded = service.addBook(bean2);
			if (bookAdded == false) {
				System.out.println("Book already exists");
			} else {
				System.out.println("Book added");
			}
			break;
		case 2:
			do {
				System.out.println("Enter BookID :");
				String bookId1 = scanner.next();
				try {
					bookId = Integer.parseInt(bookId1);
					flag = true;
				} catch (Exception e) {
					flag = false;
					System.err.println("Id should contains only digits");
				}

			} while (!flag);
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
			BookBean book = new BookBean();
			book.setBid(bookId);
			book.setBook_title(bookName);
			boolean updated = service.update(book);
			if (updated == false) {
				System.out.println("book is not updated");
			} else {
				System.out.println("book  updated");
			}
			break;
		case 3:
			System.out.println("***************************Welcome to Search Page********************************");
			System.out.println("Press 1 to Search the Book by Author");
			System.out.println("Press 2 to Search the Book by Title");
			System.out.println("Press 3 to Search the Book by Id");
			System.out.println("Press 0 for exit");
			int j = scanner.nextInt();
			switch(j) {
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
			BookBean searchByAuthor = service.searchBookAuthor(bookAuthor);
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
			BookBean searchByName = service.searchBookTitle(bookName);
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
			BookBean searchById = service.searchBookType(bookId);
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
			case 0:
				break;
			}
		case 4:
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
			if (bookId == 0) {
				System.out.println("Enter the Valid Book_Id");
			} else {
				BookBean bean6 = new BookBean();
				bean6.setBid(bookId);
				boolean remove = service.delete(bookId);
				if (remove == false) {
					System.out.println("The Book is not removed");
				} else {
					System.out.println("The Book is removed");
				}
			}

			break;
		case 5:
			LinkedList<BookBean> ids = service.getBookIds();
			for (BookBean integer : ids) {
				if (integer != null) {

					System.out.println(integer.getBid());
				} else {
					System.out.println("No Books Ids are available");
				}
			}
			break;
		case 6:
			List<BookBean> info = service.getBooksInfo();
			for (BookBean bookBean : info) {

				if (bookBean != null) {
					System.out.println(bookBean);
				} else {
					System.out.println("Books info is not present");
				}
			}
			break;
		case 7:
			System.out.println("Enter Book Id");
			int issueId = scanner.nextInt();
			System.out.println("Enter User Id");
			int userId = scanner.nextInt();
			boolean bookIssue = service.issueBook(issueId, userId);
			if (bookIssue) {
				System.out.println("-----------------------------------------------");
				System.out.println("Book Issued");
			} else {
				System.out.println("-----------------------------------------------");
				System.out.println("Book not issued");
			}
			break;
		case 8:
			System.out.println("Enter Book id");
			int returnBook = scanner.nextInt();
			System.out.println("Enter user id");
			int userId1 = scanner.nextInt();
			boolean bookReturn = service.returnBook(returnBook, userId1);
			if (bookReturn) {
				System.out.println("Book is returned");
			} else {
				System.out.println("Book not returned");
			}
			break;

		}

	}

}
