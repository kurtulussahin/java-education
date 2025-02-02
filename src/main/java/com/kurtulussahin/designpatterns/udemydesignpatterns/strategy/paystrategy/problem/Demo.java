package com.kurtulussahin.designpatterns.udemydesignpatterns.strategy.paystrategy.problem;

public class Demo {
	private static Order order = new Order();
	private static PayIfElse paymentMethodIfElse=new PayIfElse();

	public static void main(String[] args) {

		int cost;
		cost = 100;
		order.setTotalCost(cost);

		paymentMethodIfElse.pay(order.getTotalCost(), "Card");
		paymentMethodIfElse.pay(order.getTotalCost(), "Paypal");
		paymentMethodIfElse.pay(order.getTotalCost(), "Cash");


	}
}
