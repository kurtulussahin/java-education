package com.kurtulussahin.designpatterns.udemydesignpatterns.factory.abstractfactory.factorymethodsolution;

public class TableFactory implements GUIFactory {

	@Override
	public Table create() {
		return new Table();
	}
}
