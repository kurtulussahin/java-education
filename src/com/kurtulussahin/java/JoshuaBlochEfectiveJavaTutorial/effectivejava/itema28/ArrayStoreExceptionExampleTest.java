package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema28;


import org.junit.Test;

public class ArrayStoreExceptionExampleTest {

    @Test(expected=ArrayStoreException.class)
    public void ShouldThrowArrayStoreExceptionError() {
        ArrayStoreExceptionExample.throwArrayStoreExceptionError();
    }
}