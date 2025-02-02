package com.kurtulussahin.problems.fibonacci.fibonacci1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class nthFibonacciTest {

    @Test
    void nthFibonacci(){

        assertEquals(0,nthFibonacci.nthFibonacci(0));
        assertEquals(1,nthFibonacci.nthFibonacci(1));
        assertEquals(1,nthFibonacci.nthFibonacci(2));
        assertEquals(2,nthFibonacci.nthFibonacci(3));
        assertEquals(3,nthFibonacci.nthFibonacci(4));
        assertEquals(5,nthFibonacci.nthFibonacci(5));
        assertEquals(8,nthFibonacci.nthFibonacci(6));
        assertEquals(13,nthFibonacci.nthFibonacci(7));
    }
  
}