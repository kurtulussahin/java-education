package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

public class MinePumpSystemTest {

    public static void main(String[] args) {

        MinePlant minePlant = new MinePlant();
        int count=0;
        while (count<100) {
            System.out.print("Döngü " + (count + 1) + "->");
            minePlant.run();
            count++;
        }
    }
}