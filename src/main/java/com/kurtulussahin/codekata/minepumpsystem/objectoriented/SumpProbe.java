package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

import java.util.ArrayList;
import java.util.List;

public class SumpProbe {

    private final LevelSensor minLevelSensor;
    private final LevelSensor maxLevelSensor;
    private final boolean[] mustDrain=new boolean[1];
    private final DigitalOutput digitalOutput;

    public SumpProbe(LevelSensor minLevelSensor, LevelSensor maxLevelSensor) {

        this.minLevelSensor = minLevelSensor;
        this.maxLevelSensor = maxLevelSensor;
        this.digitalOutput = new DigitalOutput("Sump Probe");
    }

    public boolean mustDrain() {

        if (maxLevelSensor.isOn()) {
            digitalOutput.write("💧 Su seviyesi yüksek!");
            mustDrain[0]=true;
        } else if (minLevelSensor.isOn()) {
            digitalOutput.write("💧 Su seviyesi takip seviyesinde!");
        } else {
            digitalOutput.write("💧 Su seviyesi güvenli!");
            mustDrain[0]=false;
        }
        return mustDrain[0];
    }
}
