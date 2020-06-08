package com.capgemini.librarymanagementsystemjdbc.service;



import com.capgemini.librarymanagementsystemjdbc.dao.StudentDAO;
import com.capgemini.librarymanagementsystemjdbc.dto.BookBean;
import com.capgemini.librarymanagementsystemjdbc.factory.StudentFactory;
import java.util.List;

public class StudentServiceImp implements StudentService{
	private StudentDAO dao = StudentFactory.getStudentDAO();
	@Override
	public BookBean searchBookTitle(String bookTitle) {
		return dao.searchBookTitle(bookTitle);
	}

	@Override
	public BookBean searchBookAuthor(String Author) {
		return dao.searchBookAuthor(Author);
	}

	@Override
	public List<BookBean> getBookIds() {
		return dao.getBookIds();
	}

	@Override
	public List<BookBean> getBooksInfo() {
		return dao.getBooksInfo();
	}

	@Override
	public boolean req(int id,int book_id ) {
		return dao.req(id, book_id);
	}

	@Override
	public BookBean searchBookType(int bookId) {
		return dao.searchBookType(bookId);
	}

	@Override
	public boolean reqReturnBook(int book_Id, int id) {
		return dao.reqReturnBook(book_Id, id);
	}

}
