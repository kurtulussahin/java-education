package com.kurtulussahin.java.problems.factorial;

import org.junit.jupiter.api.Test;

import static com.kurtulussahin.java.problems.factorial.Factorial.calculateFactorial;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void shouldCalculateFactorial() {

        assertEquals(1, calculateFactorial(1));
        assertEquals(2, calculateFactorial(2));
        assertEquals(6, calculateFactorial(3));
        assertEquals(24, calculateFactorial(4));
        assertEquals(120, calculateFactorial(5));
    }

    @Test
    void calculateZeroFactorial() {
        assertEquals(1, calculateFactorial(0));
    }
}