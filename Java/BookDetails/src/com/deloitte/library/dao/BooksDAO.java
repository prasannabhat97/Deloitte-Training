package com.deloitte.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.library.model.Book;

public class BooksDAO {
	static Connection connection = null;
	
	public static Connection connectToDb() {

		
		
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
	
	public static void addBook(Book book) {
		System.out.println(book);
		//Create statement
		
		try {
			Connection con=connectToDb();
			PreparedStatement stmt = con.prepareStatement("insert into Book values(?,?,?,?)");
			stmt.setInt(1,book.getBookId());
			stmt.setString(2, book.getBookName());
			stmt.setDouble(3, book.getPrice());
			stmt.setString(4, book.getBookAuthor());
			int affectedRows=stmt.executeUpdate();
			System.out.println("Affected Rows = "+affectedRows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	public static List<Book> displayBook() {
		Connection con=connectToDb();
		List<Book> arr=new ArrayList<Book>();
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from Book");
			while(rs.next()) {
				Book book=new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setPrice(rs.getDouble(3));
				book.setBookAuthor(rs.getString(4));
				arr.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}
	public static int getNumber() {
		Connection con=connectToDb();
		Statement stmt;
		try {
			int count=0;
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select max(BookId) from book");
			while(rs.next()) {
				count=rs.getInt(1);
				System.out.println("count = "+count);
				count++;
				return count;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}
	
	public static List<Book> searchBook(String bookName) {
		List<Book> arr=new ArrayList<Book>();
		Connection con=connectToDb();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select bookname from book where bookname=?");
			stmt.setString(1,bookName);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				Book book=new Book();
				book.setBookId(rs.getInt(1));
				book.setBookName(rs.getString(2));
				book.setPrice(rs.getDouble(3));
				book.setBookAuthor(rs.getString(4));
				arr.add(book);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}

	public static boolean deleteBook(int deleteId) {
		// TODO Auto-generated method stub
		Connection con=connectToDb();
		try {
			PreparedStatement stmt = con.prepareStatement("delete from Book where bookid=?");
			stmt.setInt(1, deleteId);
			int affectedRows=stmt.executeUpdate();
			if(affectedRows>0) {
				return true;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}
}
