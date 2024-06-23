package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversion1;

public class DemoDuck {

	public static void main(String[] args) {

		Duck duck1 = new MallardDuck();
		Duck duck2 = new RedheadDuck();
		Duck duck3 = new RubberDuck();
		Duck duck4 = new DecoyDuck();

		duck1.display();
		duck2.display();
		duck3.display();
		duck4.display();
		
		duck1.quack();
		duck2.quack();
		duck3.quack();
		duck4.quack();
		
		duck1.fly();
		duck2.fly();
		duck3.fly();
		duck4.fly();
	}

}
