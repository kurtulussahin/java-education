package com.kurtulussahin.java.codekata.emilybache.parrotrefactoringkata;

public abstract class Parrot {

    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    protected Parrot(int numberOfCoconuts, double voltage, boolean isNailed) {

        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

    public abstract String getCry();
}
