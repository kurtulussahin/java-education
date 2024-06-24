package com.kurtulussahin.java.headfirstdesignpatterns.strategy.solution.duckgameversion3;

public class RedheadDuck extends Duck  {

	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		
		System.out.println("Redhead Duck Display");
		
	}


}
