package com.deloitte.library.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.deloitte.library.exceptions.BookNameException;
import com.deloitte.library.model.Book;
import com.deloitte.library.services.Bookimpl;
import com.deloitte.library.utilities.Utilities;

public class Demo {
	
	public static void main(String[] args) {
		
		List<Book> bookList=new ArrayList<Book>();
		List<Book> flag=new ArrayList<Book>();
		
		Scanner s=new Scanner(System.in);
		Bookimpl impl=new Bookimpl();
		
		
		String bookName;
		double price;
		String bookAuthor;
		int choice;
		
		while(true) {
			System.out.println("Enter 1 To Add a Book : ");
			System.out.println("Enter 2 To Display All Books : ");
			System.out.println("Enter 3 To Search Book ");
			System.out.println("Enter 4 To Delete a Book : ");
			System.out.println("Enter 5 To Exit : ");
			System.out.println("Enter Your Choice : ");
			choice=Integer.parseInt(s.next());
			
			switch(choice) {
			case 1:
				while(true) {
				System.out.println("Enter Book Name : ");
				bookName=s.next();
				try {
					Utilities.nameValidation(bookName);	
					break;
				} catch (BookNameException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					continue;
				}
				}
				System.out.println("Enter Price : ");
				price=Double.parseDouble(s.next());
				System.out.println("Enter Author Name : ");
				bookAuthor=s.next();
				impl.addBook(bookName, price, bookAuthor);
				
				System.out.println("Book Added Successfully !! ");
				break;
			case 2:
				bookList=impl.displayBook();
				for(Book a:bookList) {
					System.out.println();
					System.out.println(a);
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Enter the Book Name : ");
				String searchBook=s.next();
				flag=impl.searchBook(searchBook);
				for(Book b:flag) {
					System.out.println();
					System.out.println(b);
					System.out.println();
				}
				
				break;
			case 4:
				System.out.println("Enter the Deleting BookId : ");
				int deleteId=Integer.parseInt(s.next());
				boolean deleteStatus=impl.deleteBook(deleteId);
				if(deleteStatus==true) {
					System.out.println();
					System.out.println("Book Deleted Successfully !!");
					System.out.println();
				}
				else {
					System.out.println();
					System.out.println("BookId Not Found !!");
					System.out.println();
				}
				break;
			case 5:
				System.exit(0);
				break;
			default:
				break;
			}	
		}
	}

}
