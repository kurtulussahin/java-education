package com.kurtulussahin.codekata.minepumpsystem.procedural;

import static com.kurtulussahin.codekata.minepumpsystem.procedural.PumpController.controlPump;

public class MinePumpSystemTest {

    public static void main(String[] args) {


        int count=0;
        while (count<100) {
            System.out.print("Döngü " + (count + 1) + "->");
            controlPump();
            count++;
        }
    }
}