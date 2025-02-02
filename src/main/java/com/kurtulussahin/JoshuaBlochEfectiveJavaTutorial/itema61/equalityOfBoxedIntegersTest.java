package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema61;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class equalityOfBoxedIntegersTest {
    static Integer i;

    //Primitives identity and values are the same. Boxed types have distinct identity values from what their value is.
    @Test
    public void equalityOperatorTurnFalseForBoxedIntegers() {

        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);
        assertFalse(integer1 == integer2);

        Integer integer3 = 10;
        Integer integer4 = 10;
        assertTrue(integer3 == integer4);

        Integer integer5 = Integer.valueOf(10);
        Integer integer6 = Integer.valueOf(10);
        assertTrue(integer5 == integer6);

    }

    //Primitives always have a value, boxed types also have the option of having null as a value.
    @Test(expected=NullPointerException.class)
    public void equalityOperatorCompileWhenBoxedIntegersNull() {

        if(i==42)
            System.out.println("Unbelievable");

    }

    //slow test
    //@Test
    public void shouldPrimitivesFaster() {
        long startTime;
        long endTime;
        long diffTimePrimitive;
        long diffTimeBoxed;

        startTime = System.nanoTime();
        long sumPrimitive = 0;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sumPrimitive += i;
        }
        endTime = System.nanoTime();
        diffTimePrimitive=endTime-startTime;

        startTime = System.nanoTime();
        Long sumBoxed = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sumBoxed += i;
        }
        endTime = System.nanoTime();
        diffTimeBoxed=endTime-startTime;

        assertTrue(diffTimeBoxed>diffTimePrimitive);

    }

}