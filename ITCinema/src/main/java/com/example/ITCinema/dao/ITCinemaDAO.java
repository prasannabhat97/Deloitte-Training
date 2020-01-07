package com.example.ITCinema.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ITCinema.model.Movie;

@Repository
public class ITCinemaDAO {
	
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

	public List<Movie> getMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Movie> getSeats() {
		// TODO Auto-generated method stub
		return null;
	}

	public void postUserData() {
		// TODO Auto-generated method stub
		
	}

	public void postAdminData() {
		// TODO Auto-generated method stub
		
	}

	public void gerAdminData() {
		// TODO Auto-generated method stub
		
	}

	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		try {
			Connection con=connectToDb();
			PreparedStatement stmt = con.prepareStatement("insert into movie values(?,?,?,?,?)");
			System.out.println("Inside dao :");
			stmt.setInt(1,movie.getMovieId());
			stmt.setString(2,movie.getMovieName());
			stmt.setDouble(3,movie.getMovieRating());
			stmt.setInt(4,movie.getAvilableSeats());
			stmt.setInt(5, movie.getTotalSeats());
			int affectedRows=stmt.executeUpdate();
			System.out.println("Affected Rows = "+affectedRows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
