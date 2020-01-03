package com.itcinema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.itcineme.model.MovieAdmin;

public class MovieAdminDAO {
	

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
	
	public static  boolean addAdmin(MovieAdmin admin) {
		
		try {
			Connection con=connectToDb();
			PreparedStatement stmt = con.prepareStatement("insert into movieadmin values(?,?,?,?)");
			stmt.setString(1,admin.getUserName());
			stmt.setString(2,admin.getEmail());
			stmt.setString(3,admin.getMobile());
			stmt.setString(4,admin.getPassword());
			int affectedRows=stmt.executeUpdate();
			System.out.println("Affected Rows = "+affectedRows);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}

	public static boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		Connection con=connectToDb();
		PreparedStatement stmt;
		try {
			stmt = con.prepareStatement("select * from movieadmin where username=? and password=?");
			stmt.setString(1,userName);
			stmt.setString(2,password);
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
	
	public static List<MovieAdmin> displayAll(){
		Connection con=connectToDb();
		List<MovieAdmin> arr=new ArrayList<MovieAdmin>();
		try {
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from movieadmin");
			while(rs.next()) {
				MovieAdmin admin=new MovieAdmin();
				admin.setUserName(rs.getString(1));
				admin.setEmail(rs.getString(2));
				admin.setMobile(rs.getString(3));
				admin.setPassword(rs.getString(4));
				arr.add(admin);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arr;
	}
}
