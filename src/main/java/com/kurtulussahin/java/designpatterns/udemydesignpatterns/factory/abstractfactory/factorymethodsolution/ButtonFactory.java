package com.kurtulussahin.java.designpatterns.udemydesignpatterns.factory.abstractfactory.factorymethodsolution;

public class ButtonFactory implements GUIFactory {
	
	public Button create() {
		return new Button();
	}
}
