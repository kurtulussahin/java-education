package com.kurtulussahin.codekata.immutablegildedrose;

public class UserInterface {

    public void print(int day, Item[] items) {
        System.out.println("-------- day " + day + " --------");
        System.out.println("name, sellIn, quality");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("");
    }
}
