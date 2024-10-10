package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema63;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestDriveTest {

    @Test
    void testPerformance() {
        long start;
        long finish;

        start = System.nanoTime();
        concatenationPerformanceDemo.concatenation();
        finish = System.nanoTime();
        long timeElapsedConcatenation = finish - start;

        start = System.nanoTime();
        concatenationPerformanceDemo.stringBuiler();
        finish = System.nanoTime();
        long timeElapsedStringBuilder= finish - start;

        assertTrue(timeElapsedStringBuilder<timeElapsedConcatenation);
    }
}