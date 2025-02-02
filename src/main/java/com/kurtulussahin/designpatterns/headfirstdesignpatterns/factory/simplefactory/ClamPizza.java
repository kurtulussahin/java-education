package com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.simplefactory;

public class ClamPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("Prepare Clam Pizza" );
	}
}
