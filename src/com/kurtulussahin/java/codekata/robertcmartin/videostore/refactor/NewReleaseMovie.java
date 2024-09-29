package com.kurtulussahin.java.codekata.robertcmartin.videostore.refactor;

public class NewReleaseMovie extends Movie {

	public NewReleaseMovie(String title) {
		super(title);
	}

	double determineAmount(int daysRented) {
		return daysRented * 3;
	}

	int determineFrequentRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		return 1;
	}
	
	

}
