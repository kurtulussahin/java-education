package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

public class PumpEngine {

    private boolean isRunning = false;

    public PumpEngine() {
        this.isRunning = false;
    }

    void on() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Pump Engine is running");
        } else {
            System.out.println("Pump Engine is already running");
        }
    }

    void off() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Pump Engine is closing");
        } else {
            System.out.println("Pump Engine is already closed");
        }
    }

    void status() {
        System.out.println("Pump Engine is " + isRunning);
    }
}
