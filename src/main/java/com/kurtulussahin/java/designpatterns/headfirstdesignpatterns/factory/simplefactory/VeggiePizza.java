package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.simplefactory;

public class VeggiePizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare Veggie Pizza" );
	}
}
