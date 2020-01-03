package com.deloitte.library.services;

import java.util.List;

import com.deloitte.library.model.Book;

public interface BookInterface {
	public void addBook(String bookName,double price,String bookAuthor);
	public List<Book> displayBook();
	public List<Book> searchBook(String bookName);
	public boolean deleteBook(int bookId);
}
