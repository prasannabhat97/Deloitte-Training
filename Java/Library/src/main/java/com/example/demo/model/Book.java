package com.example.demo.model;




public class Book {
	private int bookId;
	private String bookName;
	private double price;
	
	public Book() {
		super();
		//System.out.println("Inside Constructor : ");
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
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
		return "Book [bookkId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}
	
}
