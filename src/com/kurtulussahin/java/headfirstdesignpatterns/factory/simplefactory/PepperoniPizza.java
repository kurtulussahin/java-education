package com.kurtulussahin.java.headfirstdesignpatterns.factory.simplefactory;

public class PepperoniPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare Pepperoni Pizza" );
	}

}
