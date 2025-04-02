package com.kurtulussahin.pragmaticobjects.magicnumbergame.trueoop;

class MagicNumber {
    private final int value;
    private final IPrompt prompter;

    public MagicNumber(IPrompt prompter) {
        this.prompter = prompter;
        this.value = (int) (Math.random() * 100) + 1;
    }

    public boolean compare(Guess guess) {
        if (guess.isGreaterThan(this.value)) {
            prompter.tooBig();
        } else if (guess.isLessThan(this.value)) {
            prompter.tooSmall();
        } else {
            prompter.match();
            return true;
        }
        return false;
    }

}








