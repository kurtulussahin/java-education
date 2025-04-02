package com.kurtulussahin.pragmaticobjects.magicnumbergame.trueoop;

public class Main {

    public static void main(String[] args) {
        new Game(
                new MagicNumber(new Prompter()), new Guess(new Prompter())
        ).run();
    }
}
