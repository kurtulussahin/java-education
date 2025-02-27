package com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.factorymethod;

public class DemoPizzaStore {

	public static void main(String[] args) {
	
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
		}

}
