package com.kurtulussahin.java.headfirstdesignpatterns.templatemethod;

public abstract class CaffeineBeverage {

/*
 prepareRecipe() is declared final because we don’t want our subclasses
to be able to override this method and change the
recipe! We’ve generalized steps 2 and 4 to brew()
the beverage and addCondiments().
 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
/*
  Because Coffee and Tea handle these methods
in different ways, they’re going to have to
be declared as abstract. Let the subclasses
worry about that stuff!
 */
	abstract void brew();
	abstract void addCondiments();
	
	void boilWater() {
		System.out.println("Boiling water");
	}
	void pourInCup() {
		System.out.println("Pouring into cup");
	}

}
