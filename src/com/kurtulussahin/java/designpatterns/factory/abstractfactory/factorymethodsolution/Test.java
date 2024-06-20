package com.kurtulussahin.java.designpatterns.factory.abstractfactory.factorymethodsolution;

public class Test {
    public static void main(String[] args) {
        new Client(new ButtonFactory());
    }
}

