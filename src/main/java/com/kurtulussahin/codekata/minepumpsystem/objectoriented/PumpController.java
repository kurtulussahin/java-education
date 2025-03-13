package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

import java.util.Random;

public class PumpController {

    private final PumpEngine pumpEngine= new PumpEngine();

    static final int WATER_THRESHOLD_MIN = 90;
    static final int WATER_THRESHOLD_MAX = 90;

    static final int GAS_THRESHOLD = 90;

    static int readWaterSensor() {
        return new Random().nextInt(100);
    }

    static int readGasSensor() {
        return new Random().nextInt(100);
    }

    void controlPump() {

        int waterLevel = readWaterSensor();
        int gasLevel = readGasSensor();
        System.out.println("Su Seviyesi: " + waterLevel + " | Gaz Seviyesi: " + gasLevel);

        if (gasLevel > GAS_THRESHOLD) {
                System.out.println("⚠️ Tehlikeli gaz algılandı");
                pumpEngine.off();
        } else if (waterLevel > WATER_THRESHOLD_MAX) {
                System.out.println("💧 Su seviyesi yüksek!");
                pumpEngine.on();
        } else if (waterLevel> WATER_THRESHOLD_MIN) {
                System.out.println("💧 Su seviyesi takip seviyesinde!");
                pumpEngine.status();
        } else {
                System.out.println("💧 Su seviyesi güvenli!");
                pumpEngine.off();
        }
    }
}