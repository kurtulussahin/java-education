package com.kurtulussahin.codekata.minepumpsystem.procedural;

public class MinePumpSystemTest {

    public static void main(String[] args) {

        PumpController minePumpSystem = new PumpController();

        int count=0;
        while (count<100) {
            System.out.print("Döngü " + (count + 1) + "->");
            minePumpSystem.controlPump();
            count++;
        }
    }
}