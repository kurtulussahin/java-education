package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

import java.util.ArrayList;
import java.util.List;

public class PumpEngine {

    private final boolean[] isRunning=new boolean[1];
    private final DigitalOutput digitalOutput;

    public PumpEngine(DigitalOutput digitalOutput) {

        this.digitalOutput = digitalOutput;
    }

    void on() {

        if (!isRunning[0]) {
            isRunning[0] = true;
            digitalOutput.write("Pump Engine is running");
        } else {
            digitalOutput.write("Pump Engine is already running");
        }
    }

    void off() {

        if (isRunning[0]) {
            isRunning[0] = false;
            digitalOutput.write("Pump Engine is closing");
        } else {
            digitalOutput.write("Pump Engine is already closed");
        }
    }
}
