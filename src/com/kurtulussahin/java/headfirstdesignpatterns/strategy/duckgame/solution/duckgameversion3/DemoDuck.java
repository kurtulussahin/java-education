package com.kurtulussahin.java.headfirstdesignpatterns.strategy.duckgame.solution.duckgameversion3;

public class DemoDuck {

	public static void main(String[] args) {
	
		Duck duck1 = new MallardDuck();
		Duck duck2 = new RedheadDuck();
		Duck duck3 = new RubberDuck();
		Duck duck4 = new DecoyDuck();
		Duck duck5 = new ModelDuck();

		duck1.swim();
		duck2.swim();
		duck3.swim();
		duck4.swim();
		duck5.swim();
		
		duck1.display();
		duck2.display();
		duck3.display();
		duck4.display();
		duck5.display();
		
		duck1.performQuack();
		duck2.performQuack();
		duck3.performQuack();
		duck4.performQuack();
		duck5.performQuack();
		
		duck1.performFly();
		duck2.performFly();
		duck3.performFly();
		duck4.performFly();
		
		duck5.performFly();
		duck5.setFlyBehavior(new FlyRocketPowered());
		duck5.performFly();
	}

}
