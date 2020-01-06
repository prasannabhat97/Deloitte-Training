package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Book;
import com.example.demo.services.LibraryService;

@Controller
@ResponseBody
public class LibraryController {
	@Autowired
	LibraryService lib;
	
	@RequestMapping("/")  
	public String getMessage() {
		return lib.getMessage();	
	}
	@RequestMapping("/user")
	public List<Book> getUser() {
		return lib.getUser();
	}
	
	@RequestMapping("/search")
	public List<Book> searchBook(@RequestParam ("bookId") int bookId) {
		System.out.println("inside controller : ");
		
		return lib.searchBook(bookId);
	}

	@PostMapping("/add")
	public void addBook(@RequestBody Book book) {
		lib.addBook(book);
	}
}
