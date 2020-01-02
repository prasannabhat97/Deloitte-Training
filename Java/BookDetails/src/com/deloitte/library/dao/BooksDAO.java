package com.deloitte.library.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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

}
