package com.kurtulussahin.java.designpatterns.udemydesignpatterns.templatemethod.starbuzz;

public class StarbuzzTest {
	public static void main(String[] args) {
			
		CaffeineBeverage tea =new Tea();
		CaffeineBeverage coffee =new Coffee();
		
		tea.prepareRecipe();
		coffee.prepareRecipe();

		
	}
}
