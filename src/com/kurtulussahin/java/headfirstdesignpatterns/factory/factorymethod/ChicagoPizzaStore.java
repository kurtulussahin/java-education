package com.kurtulussahin.java.headfirstdesignpatterns.factory.factorymethod;

public class ChicagoPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else return null;
	}

}
