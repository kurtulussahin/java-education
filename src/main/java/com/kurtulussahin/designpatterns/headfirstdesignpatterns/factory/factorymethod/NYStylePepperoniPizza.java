package com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.factorymethod;

public class NYStylePepperoniPizza extends Pizza{

	public NYStylePepperoniPizza() {
		name = "NY Style Sauce and Pepperoni Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Pepperoni");
	}

}
