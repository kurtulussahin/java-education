package com.kurtulussahin.java.designpatterns.udemydesignpatterns.strategy.paystrategy.solution;

public class Demo {
	private static Order order = new Order();
	private static PayStrategy strategy;

	public static void main(String[] args) {

		int cost;
		cost = 100;
		order.setTotalCost(cost);


		strategy = new PayByPayPal();
		strategy.pay(order.getTotalCost());

		strategy = new PayByCreditCard();
		strategy.pay(order.getTotalCost());

	}
}
