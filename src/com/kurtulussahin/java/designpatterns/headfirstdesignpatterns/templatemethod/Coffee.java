package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.templatemethod;

public class Coffee extends CaffeineBeverage {
	
/*
 Coffee needs to define brew() and
addCondiments() — the two abstract
methods from Beverage
 Coffee deals with coffee, and sugar and milk instead
of tea bags and lemon.
 */
	@Override
	public void brew() {
		System.out.println("Dripping Coffee through filter");
	}
	@Override
	public void addCondiments() {
		System.out.println("Adding Sugar and Milk");
	}
}
