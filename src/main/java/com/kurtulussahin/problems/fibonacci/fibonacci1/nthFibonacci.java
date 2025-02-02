package com.kurtulussahin.problems.fibonacci.fibonacci1;

public class nthFibonacci {

    public static int nthFibonacci(int n){
        if(n<=1){
            return n;
        }
        return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
}
