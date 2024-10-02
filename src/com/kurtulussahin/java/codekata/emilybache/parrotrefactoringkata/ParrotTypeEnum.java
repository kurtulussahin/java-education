package com.kurtulussahin.java.codekata.emilybache.parrotrefactoringkata;

public enum ParrotTypeEnum {

    EUROPEAN,
    AFRICAN,
    NORWEGIAN_BLUE;

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        Parrot parrot;
        switch (type) {
            case EUROPEAN -> {
                parrot = new EuropeanParrot(numberOfCoconuts, voltage, isNailed);
            }
            case AFRICAN -> {
                parrot = new AfricanParrot(numberOfCoconuts, voltage, isNailed);
            }
            case NORWEGIAN_BLUE -> {
                parrot = new NorwegianParrot(numberOfCoconuts, voltage, isNailed);
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        return parrot;
    }
}
