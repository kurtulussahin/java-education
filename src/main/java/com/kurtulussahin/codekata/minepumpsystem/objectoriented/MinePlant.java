package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

import static com.kurtulussahin.codekata.minepumpsystem.objectoriented.gasController.controlGas;

public class MinePlant {

    private final PumpEngine pumpEngine;
    private final SumpPump sumpPump;

    public MinePlant() {
        final int minWaterThreshold=80;
        final int maxWaterThreshold=90;
        SumpProbe sumpProbe = new SumpProbe(minWaterThreshold, maxWaterThreshold);
        pumpEngine = new PumpEngine();
        sumpPump = new SumpPump(pumpEngine, sumpProbe);
    }

    public MinePlant(PumpEngine pumpEngine,SumpPump sumpPump) {
        this.pumpEngine = pumpEngine;
        this.sumpPump = sumpPump;
    }


    public void run() {
        controlGas(pumpEngine);
        sumpPump.drain();
    }
}
