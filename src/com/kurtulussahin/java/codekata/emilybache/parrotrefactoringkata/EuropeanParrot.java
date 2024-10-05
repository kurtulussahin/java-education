package com.kurtulussahin.java.codekata.emilybache.parrotrefactoringkata;

public class EuropeanParrot implements Parrot {

    public EuropeanParrot() {
        super();
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }

    protected double getBaseSpeed() {
        return 12.0;
    }
}
