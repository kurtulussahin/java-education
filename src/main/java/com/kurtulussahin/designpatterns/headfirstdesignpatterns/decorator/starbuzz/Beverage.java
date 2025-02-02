package com.kurtulussahin.designpatterns.headfirstdesignpatterns.decorator.starbuzz;

public abstract class Beverage {
	String description = "Unknown Beverage";
	
	public String getDescription() {
		return description;
	}
	public abstract double cost();
}