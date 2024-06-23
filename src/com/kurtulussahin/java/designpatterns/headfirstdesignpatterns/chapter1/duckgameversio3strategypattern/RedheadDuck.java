package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversio3strategypattern;

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
