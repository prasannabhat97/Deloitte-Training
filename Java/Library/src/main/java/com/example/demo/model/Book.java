package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
	private int bookkId;
	private String bookName;
	private double price;
	
	public Book() {
		super();
		System.out.println("Inside Constructor : ");
	}
	
	public int getBookkId() {
		return bookkId;
	}
	public void setBookkId(int bookkId) {
		this.bookkId = bookkId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookkId=" + bookkId + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
}
