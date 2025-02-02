package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema29;


import org.junit.Test;

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