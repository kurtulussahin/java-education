package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

import java.util.Random;

public class PumpController {

    static final int WATER_THRESHOLD_MIN = 80;
    static final int WATER_THRESHOLD_MAX = 90;
    private final PumpEngine pumpEngine= new PumpEngine();
    private final SumpProbe sumpProbe = new SumpProbe(WATER_THRESHOLD_MIN, WATER_THRESHOLD_MAX);
    private final SumpPump sumpPump = new SumpPump(pumpEngine,sumpProbe);


    static final int GAS_THRESHOLD = 90;

    static int readWaterSensor() {
        return new Random().nextInt(100);
    }

    static int readGasSensor() {
        return new Random().nextInt(100);
    }

    void controlPump() {

        int gasLevel = readGasSensor();
        System.out.print("Gaz Seviyesi: " + gasLevel);

        if (gasLevel > GAS_THRESHOLD) {
                System.out.println("⚠️ Tehlikeli gaz algılandı");
                pumpEngine.off();
        } else {
            sumpPump.drain();
        }
    }
}