package com.kurtulussahin.java.designpatterns.factory.abstractfactory.solution;

public class GUIFactoryImpl implements GUIFactory {
    public Button createButton() {
        return new Button();
    }

	@Override
	public List createList() {
		return new List();
	}

	@Override
	public Table createTable() {
		return new Table();
	}
}
