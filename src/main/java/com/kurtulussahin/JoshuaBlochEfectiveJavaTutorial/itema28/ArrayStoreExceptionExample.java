package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema28;

public class ArrayStoreExceptionExample {
    public static void throwArrayStoreExceptionError(){
        Object[] objectArray = new Long[1];
        objectArray[0] = "asd"; // ArrayStoreException -
    }

}
