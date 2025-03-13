package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

import java.util.Random;

public class SumpProbe {

    private final int minWaterThreshold;
    private final int maxWaterThreshold;
    private  boolean mustDrain;

    static int readWaterSensor() {
        return new Random().nextInt(100);
    }

    public SumpProbe(int minWaterThreshold, int maxWaterThreshold) {
        this.minWaterThreshold = minWaterThreshold;
        this.maxWaterThreshold = maxWaterThreshold;
        mustDrain = false;
    }

    public boolean mustDrain() {

        int waterLevel = readWaterSensor();
        System.out.println(" | Su Seviyesi: " + waterLevel );

        if (waterLevel > maxWaterThreshold) {
            System.out.println("💧 Su seviyesi yüksek!");
            mustDrain = true;
            return mustDrain;
        } else if (waterLevel > minWaterThreshold) {
            System.out.println("💧 Su seviyesi takip seviyesinde!");
            return mustDrain;
        } else {
            System.out.println("💧 Su seviyesi güvenli!");
            mustDrain = false;
            return false;
        }

    }
}
