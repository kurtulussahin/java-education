package com.kurtulussahin.pragmaticobjects.magicnumbergame.trueoop;

import javax.accessibility.AccessibleText;

class MagicNumber {
    private final int value;
    private final IPrompt prompter;
    private boolean isSecret=true;

    public MagicNumber(IPrompt prompter) {
        this.prompter = prompter;
        this.value = (int) (Math.random() * 100) + 1;
    }

    public void compare(Guess guess) {
        if (guess.isGreaterThan(this.value)) {
            prompter.tooBig();
        } else if (guess.isLessThan(this.value)) {
            prompter.tooSmall();
        } else {
            prompter.match();
            isSecret=false;
        }
    }

    public boolean isSecret() {
        return isSecret;
    }

}








