package com.kurtulussahin.java.designpatterns.factory.abstractfactory.factorymethodsolution;

public class ListFactory implements GUIFactory {

	@Override
	public List create() {
		return new List();
	}

}
