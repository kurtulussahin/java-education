package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversio3strategypattern;

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
