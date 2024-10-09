package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema29;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class StackTechOneTest {

    @Test
    public void ShouldNotThrowErrorPushTrueGenericType() {
        StackTechOne<String> stack = new StackTechOne<>();
        String[] numbers = {"1", "2", "3", "4"};
        for (String number : numbers)
            stack.push(number);
    }
    @Test
    public void ShouldNotCompilePushWrongGenericType() {
        StackTechOne<Integer> stack = new StackTechOne<>();
        String[] numbers = {"1", "2", "3", "4"};
        for (String number : numbers){
            //stack.push(number);
        }
    }
}