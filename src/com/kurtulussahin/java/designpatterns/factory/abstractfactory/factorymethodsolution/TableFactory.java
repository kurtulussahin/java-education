package com.kurtulussahin.java.designpatterns.factory.abstractfactory.factorymethodsolution;

public class TableFactory implements GUIFactory {

	@Override
	public Table create() {
		return new Table();
	}
}
