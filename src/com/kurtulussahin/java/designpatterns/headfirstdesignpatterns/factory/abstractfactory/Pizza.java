package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory;

import java.util.ArrayList;

import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Cheese;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Clams;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Dough;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Pepperoni;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Sauce;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Veggies;

public abstract class Pizza {

	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;

	abstract void prepare();

	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "PIZZA";
	}
}

