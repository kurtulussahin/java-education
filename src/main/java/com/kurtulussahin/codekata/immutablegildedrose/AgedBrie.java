package com.kurtulussahin.codekata.immutablegildedrose;

public class AgedBrie implements Item{

    private final String name;
    private final int sellIn;
    private final int quality;

    public AgedBrie(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public Item update() {
        int newSellIn=sellIn;
        int newQuality = quality;
        if (newQuality < 50) {
            newQuality = newQuality + 1;
        }
        newSellIn = newSellIn - 1;
        if (newSellIn < 0) {
            if (newQuality < 50) {
                newQuality = newQuality + 1;
            }
        }
        return new AgedBrie(name,newSellIn, newQuality);
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
