package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item3;

public class StaticInitializeSingleton {

    public static StaticInitializeSingleton ds = new StaticInitializeSingleton();

    private StaticInitializeSingleton() {
        // TODO Auto-generated constructor stub
    }


    public static StaticInitializeSingleton getInstance() {
        return ds;
    }


}
