package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.duckgame.solution.duckgameversion3;

public class Squeak implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Duck Squeak");
	}

}
