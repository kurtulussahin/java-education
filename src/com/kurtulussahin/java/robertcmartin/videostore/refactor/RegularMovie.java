package com.kurtulussahin.java.robertcmartin.videostore.refactor;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title);
	}

	double determineAmount(int daysRented) {
		double rentalAmount=2;
			if (daysRented > 2)
				rentalAmount += (daysRented - 2) * 1.5;
		return rentalAmount;
	}

	int determineFrequentRenterPoints(int daysRented) {
		return 1;
	}

}
