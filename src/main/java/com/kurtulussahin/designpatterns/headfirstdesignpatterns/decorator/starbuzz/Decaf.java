package com.kurtulussahin.designpatterns.headfirstdesignpatterns.decorator.starbuzz;

public class Decaf extends Beverage{

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}
