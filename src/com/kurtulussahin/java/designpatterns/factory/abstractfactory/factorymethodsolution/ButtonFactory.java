package com.kurtulussahin.java.designpatterns.factory.abstractfactory.factorymethodsolution;

public class ButtonFactory implements GUIFactory {
	
	public Button create() {
		return new Button();
	}
}
