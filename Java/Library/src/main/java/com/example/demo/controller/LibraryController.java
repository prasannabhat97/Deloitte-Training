package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/jsp")
	public ModelAndView myMethod() {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("prasanna", lib.getMessage());
		return modelAndView;
	}
	
	@PostMapping("/login")
	public ModelAndView loginForm(@RequestBody Book book) {
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("login");
		return modelAndView;
	}
	
	@PostMapping("/welcome")
	public ModelAndView validate(@RequestBody Book book) {
		ModelAndView modelAndView=new ModelAndView();
		if(lib.loginForm(book)) {
			modelAndView.setViewName("welcome");
			modelAndView.addObject("username",book.getBookId());
		}
		else {
			modelAndView.setViewName("login");
			modelAndView.addObject("msg", "enter currect credentials !!");
		}
		return modelAndView;
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
