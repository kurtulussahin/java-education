package com.kurtulussahin.java.headfirstdesignpatterns.factory.simplefactory;

public class DemoPizzaStore {

	public static void main(String[] args) {
	
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		
		Pizza pizza1 = pizzaStore.orderPizza("cheese");

	}

}
