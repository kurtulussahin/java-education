package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item6;

import java.util.ArrayList;
import java.util.List;

public class BoxingUnboxing {

    private static long sumWrapperLongOneToMillion()
    {
        Long sum = 0L;
        for(long i = 0; i<1000000; i++)
        {
            sum += i;
        }
        return sum;
    }
    private static long sumPrimitiveLongOneToMillion()
    {
        long sum = 0;
        for(long i = 0; i<1000000; i++)
        {
            sum += i;
        }
        return sum;
    }

    public static void printTimeOfLongFunctions(){
        long startTime = System.nanoTime();
        sumWrapperLongOneToMillion();
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("sumWrapperLongOneToMillion : ");
        System.out.println(totalTime);

        startTime = System.nanoTime();
        sumPrimitiveLongOneToMillion();
        endTime   = System.nanoTime();
        totalTime = endTime - startTime;
        System.out.println("sumPrimitiveLongOneToMillion : ");
        System.out.println(totalTime);

    }

    private static void autoUnboxing() {
        List<Integer> integers = new ArrayList<>();
        int sum = 0;
        for (Integer i : integers)
        {
            if (i % 2 == 0) // i.intValue()
                sum += i;
        }
    }

    private static void autoBoxing() {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {

            integers.add(i);
            // i = Integer.valueOf(i);

        }
    }


}
