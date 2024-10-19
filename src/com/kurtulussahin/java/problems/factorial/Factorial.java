package com.kurtulussahin.java.problems.factorial;

public class Factorial {

    public static int calculateFactorial(int number){
        if(number == 1 || number==0){
            return 1;
        }
        return number * calculateFactorial(number-1);
    }
}
