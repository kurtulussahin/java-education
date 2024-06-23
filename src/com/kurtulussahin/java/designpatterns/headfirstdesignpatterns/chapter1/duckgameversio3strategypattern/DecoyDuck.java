package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversio3strategypattern;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	@Override
	public void display() {
		System.out.println("Decoy Duck Display");
		
	}

}
