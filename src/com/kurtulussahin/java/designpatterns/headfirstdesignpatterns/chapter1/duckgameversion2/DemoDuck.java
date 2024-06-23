package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.chapter1.duckgameversion2;

public class DemoDuck {

	public static void main(String[] args) {

		MallardDuck duck1 = new MallardDuck();
		RedheadDuck duck2 = new RedheadDuck();
		RubberDuck duck3 = new RubberDuck();
		DecoyDuck duck4 = new DecoyDuck();

		duck1.display();
		duck2.display();
		duck3.display();
		duck4.display();
		
		duck1.quack();
		duck2.quack();
		duck3.quack();
		
		duck1.fly();
		duck2.fly();

	}

}
