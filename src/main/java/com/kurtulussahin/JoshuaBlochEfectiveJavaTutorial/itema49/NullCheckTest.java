package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema49;


import org.junit.Test;

public class NullCheckTest {

    @Test(expected=NullPointerException.class)
    public void nullCheck() {

        NullCheck.nullCheck(null);
    }
}