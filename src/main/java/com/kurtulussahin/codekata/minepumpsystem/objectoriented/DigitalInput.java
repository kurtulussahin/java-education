package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

public class DigitalInput {

    private final Input input;

    DigitalInput(Input input) {
        this.input = input;
    }

    public int read() {
        return input.value();
    }
}
