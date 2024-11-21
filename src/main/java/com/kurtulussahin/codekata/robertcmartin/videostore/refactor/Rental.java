package com.kurtulussahin.codekata.robertcmartin.videostore.refactor;

public class Rental
{
	
	private Movie movie;
	private int daysRented;
	
	public Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}
	
	public int getDaysRented () {
		return daysRented;
	}

	public String getTitle() {
		return movie.getTitle();
	}
	
	double determineAmount() {
		return movie.determineAmount(daysRented);
	}
	
	int determineFrequentRenterPoints() {
		return movie.determineFrequentRenterPoints(daysRented);
	}
}