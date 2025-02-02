package com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.abstractfactory;

import com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Cheese;
import com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Clams;
import com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Dough;
import com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Pepperoni;
import com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Sauce;
import com.kurtulussahin.designpatterns.headfirstdesignpatterns.factory.abstractfactory.ingredients.Veggies;

public interface PizzaIngredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
