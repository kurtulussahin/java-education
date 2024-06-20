package com.kurtulussahin.java.designpatterns.factory.abstractfactory.solution;

interface GUIFactory {

	public Component createButton();

	public Component createList();

	public Component createTable();
}
