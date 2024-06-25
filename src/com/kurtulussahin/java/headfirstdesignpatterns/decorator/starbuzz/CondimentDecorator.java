package com.kurtulussahin.java.headfirstdesignpatterns.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
