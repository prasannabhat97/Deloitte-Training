package com.deloitte.library.services;

import java.util.ArrayList;

import com.deloitte.library.model.Book;

public interface BookInterface {
	public void addBook(String bookName,double price,String bookAuthor);
	public void displayBook(ArrayList<Book> list);
}
