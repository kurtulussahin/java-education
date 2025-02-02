package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.duckgame.problem.duckgameversion2;

public class RedheadDuck extends Duck implements Flyable, Quackable  {

	@Override
	public void display() {
		
		System.out.println("Redhead Duck Display");
		
	}

	@Override
	public void quack() {
		System.out.println("Redhead Duck quack");
		
	}

	@Override
	public void fly() {
		System.out.println("Redhead Duck fly");
		
	}

}
