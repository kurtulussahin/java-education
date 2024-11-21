package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item1;

public class Yemek {

    String name;

    public static Yemek sogukYemek() {
        return new Dondurma();
    }

    public static Yemek sicakYemek() {
		return new Pide();
    }

}
