package com.capgemini.librarymanagementsystemjdbc.service;


import java.util.List;
import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;
//import java.util.LinkedList;
//import com.capgemini.librarymanagementsystemjdbc.dto.BorrowedBookBean;
//import com.capgemini.librarymanagementsystemjdbc.dto.RequestBook;

public interface StudentService {
	public List<BookBean> getBookIds();
	public List<BookBean> getBooksInfo();
	public BookBean searchBookTitle(String bookTitle); 
	public BookBean searchBookAuthor(String Author);
	boolean reqReturnBook(int book_Id, int id);
	BookBean searchBookType(int bookId);
	boolean req(int id, int book_id);
}
