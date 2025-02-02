package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.duckgame.solution.duckgameversion3;

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
