package com.kurtulussahin.designpatterns.headfirstdesignpatterns.decorator.starbuzz;

public class Soy extends CondimentDecorator{
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage=beverage;
	}

	@Override
	public String getDescription() {

		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return 0.30 + beverage.cost();
	}

}
