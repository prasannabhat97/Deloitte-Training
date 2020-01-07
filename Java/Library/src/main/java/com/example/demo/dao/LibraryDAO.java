package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Book;

@Repository
public class LibraryDAO {

	public String getMessage() {
		return "Message from dao";
	}

	public static Connection connectToDb() {
		Connection connection = null;
		try {
			// Register the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// create connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "prasanna", "1234");
			return connection;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public List<Book> displayAll() {
		Connection con = connectToDb();
		List<Book> arr = new ArrayList<Book>();
		PreparedStatement stmt;
		ResultSet rs = null;
		try {
			 stmt = con.prepareStatement("select * from book");
			 rs = stmt.executeQuery();
				while (rs.next()) {
				Book book = new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setPrice(rs.getDouble(3));
				arr.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}
	
	public List<Book> searchBook(int bookId) {
		List<Book> arr=new ArrayList<Book>();
		Connection con=connectToDb();
		PreparedStatement stmt;
		System.out.println("inside dao : ");
		try {
			stmt = con.prepareStatement("select * from book where bookid=?");
			stmt.setInt(1,bookId);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				Book book=new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setPrice(rs.getDouble(3));
				arr.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}

	public void addBook(Book book) {
		// TODO Auto-generated method stub
		int id=book.getBookId();
		String name=book.getBookName();
		double price=book.getPrice();
		
		Connection con = connectToDb();
		PreparedStatement stmt;
		try {
			stmt=con.prepareStatement("insert into library values(?,?,?)");
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setDouble(3, price);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public boolean loginForm(Book book) {
		Connection con=connectToDb();
		PreparedStatement stmt;
		try {
			stmt=con.prepareStatement("select * from book where bookid=? and bookname=?");
			stmt.setInt(1,book.getBookId());
			stmt.setString(2,book.getBookName());
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
			return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
