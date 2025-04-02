package com.kurtulussahin.codekata.immutablegildedrose;

public final class BackstagePass implements Item{

    private final String name;
    private final int sellIn;
    private final int quality;

    public BackstagePass(String name, int sellIn, int quality) {
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

            if (newSellIn < 11) {
                if (newQuality < 50) {
                    newQuality = newQuality + 1;
                }
            }

            if (newSellIn < 6) {
                if (newQuality < 50) {
                    newQuality = newQuality + 1;
                }
            }
        }

        newSellIn = newSellIn - 1;

        if (newSellIn < 0) {
            newQuality = 0;
        }
        return new BackstagePass(name,newSellIn,newQuality);
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
