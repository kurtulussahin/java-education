package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

import java.util.Random;

public class gasController {

    static final int GAS_THRESHOLD = 90;

    static int readGasSensor() {
        return new Random().nextInt(100);
    }

    public static void controlGas(PumpEngine pumpEngine) {
        int gasLevel = readGasSensor();
        System.out.println("Gaz Seviyesi: " + gasLevel);

        if (gasLevel > GAS_THRESHOLD) {
            System.out.println("⚠️ Tehlikeli gaz algılandı");
            pumpEngine.off();
        }
    }

}
