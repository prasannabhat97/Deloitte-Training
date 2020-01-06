package com.example.ITCinema.model;

import java.util.*;

public class User {
private String userMobile;
private String userEmail;
private String movieBooked;
private List<String> seatsBooked=new ArrayList<String>();
private String bookingDate;
public String getUserMobile() {
	return userMobile;
}
public void setUserMobile(String userMobile) {
	this.userMobile = userMobile;
}
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getMovieBooked() {
	return movieBooked;
}
public void setMovieBooked(String movieBooked) {
	this.movieBooked = movieBooked;
}
public List<String> getSeatsBooked() {
	return seatsBooked;
}
public void setSeatsBooked(List<String> seatsBooked) {
	this.seatsBooked = seatsBooked;
}
public String getBookingDate() {
	return bookingDate;
}
public void setBookingDate(String bookingDate) {
	this.bookingDate = bookingDate;
}
@Override
public String toString() {
	return "User [userMobile=" + userMobile + ", userEmail=" + userEmail + ", movieBooked=" + movieBooked
			+ ", seatsBooked=" + seatsBooked + ", bookingDate=" + bookingDate + "]";
}



}
