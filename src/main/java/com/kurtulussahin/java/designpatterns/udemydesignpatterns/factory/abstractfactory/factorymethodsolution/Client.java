package com.kurtulussahin.java.designpatterns.udemydesignpatterns.factory.abstractfactory.factorymethodsolution;

public class Client {
    public Client(GUIFactory factory){
        Component component = factory.create();
        component.paint();
    }
}