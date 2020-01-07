package com.example.ITCinema.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ITCinema.model.Movie;
import com.example.ITCinema.services.ITCinemaServices;

@Controller
@ResponseBody
public class ITCinemaController {
	
	@Autowired
	ITCinemaServices services;
	
	@RequestMapping("/hi")
	public String getMovies(){
		return "hi";
	}
	
//	@RequestMapping("/seats")
//	public List<Movie> getSeats(){
//		return null;	
//	}
//	
//	@RequestMapping("/userInfo")
//	public void postUserdata() {
//		
//	}
//	
//	@PostMapping("/adminSignup")
//	public void postAdminData() {	
//		
//	}
//	
//	@PostMapping("/adminLogin")
//	public void getAdminData() {
//		
//	}
//	@PostMapping("/addMovie")
//	public void addMovies(@RequestBody Movie movie) {
//		System.out.println("Inside Add :");
//		services.addMovie(movie);
//	}
}
