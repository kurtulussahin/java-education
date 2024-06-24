package com.kurtulussahin.java.headfirstdesignpatterns.strategy.solution.duckgameversion3;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		System.out.println("Mallard Duck Display");
		
	}

}
