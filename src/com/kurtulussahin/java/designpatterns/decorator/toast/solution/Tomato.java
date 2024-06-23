package com.kurtulussahin.java.designpatterns.decorator.toast.solution;

public class Tomato extends Topping{

	public Tomato(Toastable toastTopping, String name, int price) {
		super(toastTopping, price, name);
	}
}
