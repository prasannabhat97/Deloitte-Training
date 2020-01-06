package com.example.ITCinema.model;

import java.util.ArrayList;
import java.util.List;

public class Movie {
private int movieId;
private String movieName;
private List<String> avilableSeats =new ArrayList<String>();
private double movieRating;
private int totalSeats;
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public List<String> getAvilableSeats() {
	return avilableSeats;
}
public void setAvilableSeats(List<String> avilableSeats) {
	this.avilableSeats = avilableSeats;
}
public double getMovieRating() {
	return movieRating;
}
public void setMovieRating(double movieRating) {
	this.movieRating = movieRating;
}
public int getTotalSeats() {
	return totalSeats;
}
public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
}
@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", avilableSeats=" + avilableSeats
			+ ", movieRating=" + movieRating + ", totalSeats=" + totalSeats + "]";
}



}
