package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

public class SumpPump {

    private final PumpEngine pumpEngine;
    private final SumpProbe sumpProbe;

    public SumpPump(PumpEngine pumpEngine, SumpProbe sumpProbe) {

        this.pumpEngine = pumpEngine;
        this.sumpProbe = sumpProbe;
    }

    void drain() {

        if (sumpProbe.mustDrain()) {
            pumpEngine.on();
        } else {
            pumpEngine.off();
        }
    }
}
