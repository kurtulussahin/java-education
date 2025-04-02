package com.kurtulussahin.pragmaticobjects.magicnumbergame.trueoop;

class Guess {
    private int value;
    private final IPrompt prompt;

    public Guess(IPrompt prompt) {
        this.prompt = prompt;
    }

    public void start() {
        this.value = prompt.prompt();
    }

    public boolean isGreaterThan(int value) {
        return this.value > value;
    }

    public boolean isLessThan(int value) {
        return this.value < value;
    }
}
