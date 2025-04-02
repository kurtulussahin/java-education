package com.kurtulussahin.pragmaticobjects.magicnumbergame.procedural;

import java.util.Scanner;
import java.util.Random;

public class MagicNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the magic number !");
        int magicNumber = random.nextInt(100) + 1;
        int userNumber = -1;

        while (userNumber != magicNumber) {
            System.out.print("Enter your guess: ");

            if (scanner.hasNextInt()) {
                userNumber = scanner.nextInt();

                if (userNumber > magicNumber) {
                    System.out.println("Too big");
                } else if (userNumber < magicNumber) {
                    System.out.println("Too small !");
                } else {
                    System.out.println("You won !");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scanner.next(); // Geçersiz girdiyi temizle
            }
        }

        scanner.close();
    }
}
