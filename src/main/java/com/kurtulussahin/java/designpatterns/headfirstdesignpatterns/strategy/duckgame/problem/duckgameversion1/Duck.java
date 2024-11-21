package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.strategy.duckgame.problem.duckgameversion1;

public abstract class Duck {
	
	public void quack() {
		System.out.println("Duck quack");
	}
	
	public void swim() {
		System.out.println("Duck swim");
	}
	
	public void fly() {
		System.out.println("Duck fly");
	}
	
	public abstract void display();
}
