package com.kurtulussahin.designpatterns.headfirstdesignpatterns.strategy.duckgame.solution.duckgameversion3;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
	}
	
	public abstract void display();
	
	public void swim() {
		System.out.println("All Ducks swim");
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();;
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	

}
