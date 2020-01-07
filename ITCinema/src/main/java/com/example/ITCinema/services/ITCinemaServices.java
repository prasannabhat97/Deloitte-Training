package com.example.ITCinema.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ITCinema.dao.ITCinemaDAO;
import com.example.ITCinema.model.Movie;

@Service
public class ITCinemaServices {
	@Autowired
	ITCinemaDAO dao;
	
	public List<Movie> getMovie(){
		return dao.getMovies();
		}
	public List<Movie> getSeats(){
		return dao.getSeats();	
	}
	public void postUserdata() {
		dao.postUserData();
	}
	
	public void postAdminData() {
		dao.postAdminData();
	}
	public void getAdminData() {
		dao.gerAdminData();
	}
	public void addMovie(Movie movie) {
		// TODO Auto-generated method stub
		System.out.println("Inside ser :");
		dao.addMovie(movie);
	}
}
