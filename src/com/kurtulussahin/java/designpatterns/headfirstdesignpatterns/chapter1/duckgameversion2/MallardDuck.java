package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversion2;

public class MallardDuck extends Duck implements Flyable, Quackable {

	@Override
	public void display() {
		System.out.println("Mallard Duck Display");
		
	}

	@Override
	public void fly() {
		System.out.println("Mallard Duck Fly");
		
	}

	@Override
	public void quack() {
		System.out.println("Mallard Duck quack");
		
	}

}
