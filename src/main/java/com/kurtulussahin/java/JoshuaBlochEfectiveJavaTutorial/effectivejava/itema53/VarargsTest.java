package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema53;


import org.junit.Test;

public class VarargsTest {

    @Test(expected=IllegalArgumentException.class)
    public void zeroParameterAllovedVarargs() {

        Varargs.zeroParameterAllovedVarargs();
    }

    @Test
    public void leastOneParameterAllovedVarargs() {
        //Compile time error
        //Varargs.leastOneParameterAllovedVarargs();
    }
}