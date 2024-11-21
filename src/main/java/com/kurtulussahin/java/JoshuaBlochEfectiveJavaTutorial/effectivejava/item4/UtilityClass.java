package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item4;

public class UtilityClass {

    private UtilityClass() {
        throw new AssertionError();
    }

    public static int sum(int number1, int number2){
        return number1 + number2;
    }
}
