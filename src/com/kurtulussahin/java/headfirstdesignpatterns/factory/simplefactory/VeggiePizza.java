package com.kurtulussahin.java.headfirstdesignpatterns.factory.simplefactory;

public class VeggiePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare Veggie Pizza" );
	}
}
