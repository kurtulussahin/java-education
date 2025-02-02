package com.kurtulussahin.designpatterns.udemydesignpatterns.factory.abstractfactory.factorymethodsolution;

public class ListFactory implements GUIFactory {

	@Override
	public List create() {
		return new List();
	}

}
