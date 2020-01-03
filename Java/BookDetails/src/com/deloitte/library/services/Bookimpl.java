package com.deloitte.library.services;


import java.util.List;

import com.deloitte.library.dao.BooksDAO;
import com.deloitte.library.model.Book;

public class Bookimpl implements BookInterface{
	
	@Override
	public void addBook( String bookName, double price, String bookAuthor) {
		// TODO Auto-generated method stub
		
		Book book=new Book();
		book.setBookId(BooksDAO.getNumber());
		book.setBookName(bookName);
		book.setPrice(price);
		book.setBookAuthor(bookAuthor);
		BooksDAO.addBook(book);
	}

	@Override
	public List<Book>  displayBook() {
		// TODO Auto-generated method stub
		return BooksDAO.displayBook();
	}

	@Override
	public List<Book> searchBook(String bookName) {
		// TODO Auto-generated method stub
		return BooksDAO.searchBook(bookName);
	}

	public boolean deleteBook(int deleteId) {
		// TODO Auto-generated method stub
		return BooksDAO.deleteBook(deleteId);
	}

}
