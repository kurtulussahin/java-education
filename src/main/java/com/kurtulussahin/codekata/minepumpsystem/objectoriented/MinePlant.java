package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

import static com.kurtulussahin.codekata.minepumpsystem.objectoriented.gasController.controlGas;

public class MinePlant {

    static final int WATER_THRESHOLD_MIN = 80;
    static final int WATER_THRESHOLD_MAX = 90;
    private final PumpEngine pumpEngine = new PumpEngine();
    private final SumpProbe sumpProbe = new SumpProbe(WATER_THRESHOLD_MIN, WATER_THRESHOLD_MAX);
    private final SumpPump sumpPump = new SumpPump(pumpEngine, sumpProbe);

    public MinePlant() {

    }


    public void run() {
        controlGas(pumpEngine);
        sumpPump.drain();
    }
}
