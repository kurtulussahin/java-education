package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.duckgame.problem.duckgameversion2;

public class RubberDuck extends Duck implements Quackable  {

	@Override
	public void quack() {
		System.out.println("Rubber Duck Squeak");
		
	}
	
	@Override
	public void display() {
		System.out.println("Rubber Duck Display");
		
	}

}
