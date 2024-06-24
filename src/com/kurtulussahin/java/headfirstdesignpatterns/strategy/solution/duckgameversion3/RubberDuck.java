package com.kurtulussahin.java.headfirstdesignpatterns.strategy.solution.duckgameversion3;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println("Rubber Duck Display");
		
	}

}
