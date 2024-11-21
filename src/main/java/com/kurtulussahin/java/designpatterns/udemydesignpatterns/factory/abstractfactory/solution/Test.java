package com.kurtulussahin.java.designpatterns.udemydesignpatterns.factory.abstractfactory.solution;

public class Test {
    public static void main(String[] args) {
        new Client(new GUIFactoryImpl());
    }
}

