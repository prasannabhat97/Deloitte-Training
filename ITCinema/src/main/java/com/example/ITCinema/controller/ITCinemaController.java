package com.example.ITCinema.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ITCinema.model.Movie;
import com.example.ITCinema.services.ITCinemaServices;

@Controller
@ResponseBody
public class ITCinemaController {
	
	@Autowired
	ITCinemaServices services;
	
	@RequestMapping("/")
	public List<Movie> getMovies(){
		return null;
	}
	@RequestMapping("/seats")
	public List<Movie> getSeats(){
		return null;	
	}
	@RequestMapping("/userInfo")
	public void postUserdata() {
		
	}
	@RequestMapping("/adminSignup")
	public void postAdminData() {
		
	}
	@RequestMapping("/adminLogin")
	public void getAdminData() {
		
	}
}
