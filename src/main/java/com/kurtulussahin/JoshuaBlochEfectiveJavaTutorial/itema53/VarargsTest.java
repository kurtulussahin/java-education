package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema53;


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