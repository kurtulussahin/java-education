package com.kurtulussahin.java.codekata.neetcodeDynamicArray;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DynamicIntArrayTest {

    DynamicIntArray nums = new DynamicIntArray(10);

    @Test
    void get() {
        nums.pushback(100);
        nums.pushback(200);
        nums.pushback(500);

        assertEquals(nums.get(1),200);
    }

    @Test
    void set() {
        nums.set(3,100);
        assertEquals(nums.get(3),100);
    }

    @Test
    void pushback() {
        nums.pushback(100);
        nums.pushback(200);
        nums.pushback(500);

        assertEquals(nums.getSize(),3);
    }

    @Test
    void popback() {
        nums.pushback(100);
        nums.pushback(200);
        nums.pushback(500);
        nums.popback();

        assertEquals(nums.getSize(),2);
    }

    @Test
    void getSize() {
        nums.pushback(100);
        nums.pushback(200);
        nums.pushback(500);
        nums.popback();

        assertEquals(nums.getSize(),2);
    }

    @Test
    void getCapacity() {

        assertEquals(nums.getCapacity(),10);
    }

    @Test
    void shoudGrows() {

        assertEquals(nums.getCapacity(),10);
        nums.pushback(100);
        nums.pushback(200);
        nums.pushback(500);
        nums.pushback(100);
        nums.pushback(200);
        nums.pushback(500);
        nums.pushback(100);
        nums.pushback(200);
        nums.pushback(500);
        nums.pushback(100);
        nums.pushback(200);
        nums.pushback(500);
        assertTrue(nums.getCapacity()>10);


    }
}