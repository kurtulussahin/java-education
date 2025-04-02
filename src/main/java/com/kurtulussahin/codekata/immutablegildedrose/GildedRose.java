package com.kurtulussahin.codekata.immutablegildedrose;

public class GildedRose {
    private final Item[] items;
    private final UserInterface uInterface=new UserInterface();

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void run(int days){
        for (int i = 0; i < days; i++) {
            uInterface.print(i,items);
            for (int j = 0; j < items.length; j++) {
                items[j]=items[j].update();
            }
        }
    }
}
