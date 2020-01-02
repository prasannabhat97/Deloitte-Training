package com.it.cinema;

public abstract class Movie {
	private String movieName;
	private String movieDate;
	private double movieRating;
	private String movieReview;
	private int totalSeats;
	private int availableSeats;

	abstract void addMovie();

	abstract void delMovie();

	abstract void bookTicket();

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieDate() {
		return movieDate;
	}

	public void setMovieDate(String movieDate) {
		this.movieDate = movieDate;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	public String getMovieReview() {
		return movieReview;
	}

	public void setMovieReview(String movieReview) {
		this.movieReview = movieReview;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieDate=" + movieDate + ", movieRating=" + movieRating
				+ ", movieReview=" + movieReview + ", totalSeats=" + totalSeats + ", availableSeats=" + availableSeats
				+ "]";
	}

}
