package com.kurtulussahin.designpatterns.udemydesignpatterns.templatemethod.starbuzz;

public class Tea extends CaffeineBeverage {
	
/*
 Tea needs to define brew() and
addCondiments() — the two abstract
methods from Beverage
 */
	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}
	@Override
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
}
