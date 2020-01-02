package com.deloitte.library.services;

import java.util.ArrayList;

import com.deloitte.library.dao.BooksDAO;
import com.deloitte.library.model.Book;

public class Bookimpl implements BookInterface{
	
	@Override
	public void addBook( String bookName, double price, String bookAuthor) {
		// TODO Auto-generated method stub
		
		Book book=new Book();
		book.setBookId(Book.getCount());
		book.setBookName(bookName);
		book.setPrice(price);
		book.setBookAuthor(bookAuthor);
		BooksDAO.addBook(book);
	}

	@Override
	public void  displayBook(ArrayList<Book> list) {
		// TODO Auto-generated method stub
		for(Book i:list) {
			System.out.println(i);
		}
	}

}
