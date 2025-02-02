package com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.simplefactory;

public class CheesePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare Cheese Pizza" );
	}

}
