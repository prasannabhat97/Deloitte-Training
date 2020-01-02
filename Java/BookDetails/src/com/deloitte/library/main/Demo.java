package com.deloitte.library.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.deloitte.library.dao.BooksDAO;
import com.deloitte.library.model.Book;
import com.deloitte.library.services.Bookimpl;

public class Demo {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Bookimpl impl=new Bookimpl();
		ArrayList<Book> bookList=new ArrayList<Book>(); 
		
		String bookName;
		double price;
		String bookAuthor;
		int choice;
		
		while(true) {
			System.out.println("Enter 1 To Add a Book : ");
			System.out.println("Enter 2 To Display All Books : ");
			System.out.println("Enter 3 To Exit : ");
			System.out.println("Enter Your Choice : ");
			choice=Integer.parseInt(s.next());
			
			switch(choice) {
			case 1:
				System.out.println("Enter Book Name : ");
				bookName=s.next();
				System.out.println("Enter Price : ");
				price=Double.parseDouble(s.next());
				System.out.println("Enter Author Name : ");
				bookAuthor=s.next();
				impl.addBook(bookName, price, bookAuthor);
				
				System.out.println("Book Added Successfully !! ");
				break;
			case 2:
				impl.displayBook(bookList);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				break;
			}
			
		}
	}

}
