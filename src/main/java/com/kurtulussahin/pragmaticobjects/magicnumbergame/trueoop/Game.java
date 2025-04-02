package com.kurtulussahin.pragmaticobjects.magicnumbergame.trueoop;

class Game {

    private final MagicNumber magicNumber;
    private final Guess guess;

    public Game(MagicNumber magicNumber, Guess guess) {
        this.magicNumber = magicNumber;
        this.guess=guess;
    }

    public void run() {

            do {
                guess.start();
            } while (!magicNumber.compare(guess));

    }


}
