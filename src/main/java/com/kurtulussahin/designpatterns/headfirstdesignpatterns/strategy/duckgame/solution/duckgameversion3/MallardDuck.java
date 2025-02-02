package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.duckgame.solution.duckgameversion3;

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
