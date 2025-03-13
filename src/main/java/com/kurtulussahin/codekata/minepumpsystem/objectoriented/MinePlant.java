package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

public class MinePlant {

    private final SumpPump sumpPump;

    public MinePlant(SumpPump sumpPump) {

        this.sumpPump = sumpPump;
    }
    public void run() {
        //controlGas(new PumpEngine(new DigitalOutput("Engine")));
        sumpPump.drain();
    }
}
