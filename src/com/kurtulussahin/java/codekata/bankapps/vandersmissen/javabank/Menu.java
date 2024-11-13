package com.kurtulussahin.java.codekata.bankapps.vandersmissen.javabank;

import java.util.Scanner;

public class Menu {
    Scanner keyboard = new Scanner(System.in);
    Bank bank=new Bank();
    private boolean exit;

    public static void main(String[] args){
        Menu menu = new Menu();
        menu.runMenu();
    }


    public void runMenu(){
        printHeader();
        while(!exit){
            printMenu();
            int choice=getInput();
            performAction(choice);
        }
    }

    private void performAction(int choice) {
        switch (choice){
            case 0:
                System.out.println("Thank you for using our application");
                System.exit(0);
                break;
            case 1:
                createAnAccount();
                break;
            case 2:
                makeADeposit();
                break;
            case 3:
                makeAWithdraw();
                break;
            case 4:
                listBalances();
                break;
            default:
                System.out.println("Unknown error has occured");
        }
    }

    private void listBalances() {
    }

    private void makeAWithdraw() {
    }

    private void makeADeposit() {
    }

    private void createAnAccount() {
    }

    private int getInput() {
        int choice =-1;
        do {
            System.out.println("Enter your choice: ");
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Numbers only please!");
            }
            if (choice < 0 || choice > 4) {
                System.out.println(("Choice outside of range. Pleace choice again."));
            }
        }while(choice < 0 || choice > 4);

        return choice;
    }

    private void printMenu() {
        System.out.println("Please make a selection: ");
        System.out.println("1) Create a new Account");
        System.out.println("2) Make a deposit");
        System.out.println("3) Make a withdraw");
        System.out.println("4) List account balance");
        System.out.println("0) Exit");
    }

    private void printHeader() {
        System.out.println("+--------------------------------+");
        System.out.println("|------------Welcome-------------|");
        System.out.println("|-----------Java Bank------------|");
        System.out.println("+--------------------------------+");
    }
}
