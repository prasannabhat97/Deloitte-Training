package com.example.demo.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.dao.LibraryDAO;
import com.example.demo.model.Book;


@Service
public class LibraryService {
@Autowired
LibraryDAO repositary;

public String getMessage() {
	return repositary.getMessage();
}

public List<Book> getUser() {
	// TODO Auto-generated method stub
	
	return repositary.displayAll();
}

public List<Book> searchBook(int bookId){
	
	return repositary.searchBook(bookId);
}

public void addBook(Book book) {
	// TODO Auto-generated method stub
	repositary.addBook(book);
}

public boolean loginForm(Book book) {
	// TODO Auto-generated method stub
	return repositary.loginForm(book);
}

}
