package com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory;

import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Cheese;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Clams;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Dough;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.FreshClams;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Garlic;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.MarinaraSauce;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Mushroom;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Onion;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Pepperoni;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.RedPepper;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.ReggianoCheese;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Sauce;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.SlicedPepperoni;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.ThinCrustDough;
import com.kurtulussahin.java.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
