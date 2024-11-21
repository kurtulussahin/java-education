package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.decorator.starbuzz;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "Dark Roast";
	}

	@Override
	public double cost() {
		return 0.99;
	}

}
