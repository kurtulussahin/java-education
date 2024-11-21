package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema49;


import org.junit.Test;

public class NullCheckTest {

    @Test(expected=NullPointerException.class)
    public void nullCheck() {

        NullCheck.nullCheck(null);
    }
}