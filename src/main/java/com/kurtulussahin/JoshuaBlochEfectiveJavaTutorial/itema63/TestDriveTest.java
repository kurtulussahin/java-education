package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema63;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class TestDriveTest {

    @Test
    public void testPerformance() {
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