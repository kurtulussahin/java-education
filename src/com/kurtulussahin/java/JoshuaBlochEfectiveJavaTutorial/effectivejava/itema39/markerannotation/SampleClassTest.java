package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema39.markerannotation;


import com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema39.annotationwithparameter.ExceptionTest;

class SampleClassTest {

    @Test
    static void letsSeeThrowNotEqual() {
        SampleClass sampleClassInstance = new SampleClass(10);
        if(sampleClassInstance.getaVariable()!=9){
            throw new NotEqual();
        }

    }

    @TestException(ArrayIndexOutOfBoundsException.class)
    public static void m2() { // Should fail (wrong exception)
        int[] a = new int[0];
        int i = a[1];
    }


    @Test
    static void letsSeeAssertTrue() {
        SampleClass sampleClassInstance = new SampleClass(10);
        String actualString = sampleClassInstance.toString();
        String expectedString = "SampleClass{aVariable=10}";
        if(actualString.equals(expectedString)){
            System.out.println("AssertTrue");
            System.out.println("expected: " + expectedString);
            System.out.println("actual: " + actualString);
        }else {
            System.out.println("AssertFalse");
            System.out.println("expected" + expectedString);
            System.out.println("actual" + actualString);
            throw new Failed();
        }
    }

    public static class NotEqual extends RuntimeException {

    }
    public static class Failed extends RuntimeException {

    }
}