package com.kurtulussahin.pragmaticobjects.magicnumbergame.trueoop;

class Game {

    private final MagicNumber magicNumber;
    private final Guess guess;

    public Game(MagicNumber magicNumber, Guess guess) {
        this.magicNumber = magicNumber;
        this.guess=guess;
    }

    public void run() {
        while (magicNumber.isSecret()) {
            guess.start();
            magicNumber.compare(guess);
        }
    }


}
