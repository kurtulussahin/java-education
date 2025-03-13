package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

public class MinePumpSystemTest {

    public static void main(String[] args) {

        PumpController pumpController = new PumpController();

        int count=0;
        while (count<100) {
            System.out.print("Döngü " + (count + 1) + "->");
            pumpController.controlPump();
            count++;
        }
    }
}