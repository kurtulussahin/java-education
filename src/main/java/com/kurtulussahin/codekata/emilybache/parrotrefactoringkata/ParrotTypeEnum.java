package com.kurtulussahin.codekata.emilybache.parrotrefactoringkata;

public enum ParrotTypeEnum {

    EUROPEAN,
    AFRICAN,
    NORWEGIAN_BLUE;

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        Parrot parrot;
        switch (type) {
            case EUROPEAN -> {
                parrot = new EuropeanParrot();
            }
            case AFRICAN -> {
                parrot = new AfricanParrot(numberOfCoconuts);
            }
            case NORWEGIAN_BLUE -> {
                parrot = new NorwegianParrot(voltage, isNailed);
            }
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        return parrot;
    }
}
