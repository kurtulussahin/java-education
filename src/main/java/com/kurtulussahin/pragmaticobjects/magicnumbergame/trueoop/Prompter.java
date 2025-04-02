package com.kurtulussahin.pragmaticobjects.magicnumbergame.trueoop;

import java.util.Scanner;

class Prompter implements IPrompt {
    private final Scanner scanner;

    public Prompter() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int prompt() {
        System.out.print("Enter your guess: ");
        return scanner.nextInt();
    }

    @Override
    public void tooBig() {
        System.out.println("The number is too big");
    }

    @Override
    public void tooSmall() {
        System.out.println("The number is too small");

    }

    @Override
    public void match() {
        System.out.println("You won");
    }

}
