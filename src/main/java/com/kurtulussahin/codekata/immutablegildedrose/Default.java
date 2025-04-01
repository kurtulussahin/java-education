package com.kurtulussahin.codekata.immutablegildedrose;

public class Default implements Item {

    public String name;
    public int sellIn;
    public int quality;

    public Default(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public void update() {
        if (quality > 0) {
            quality = quality - 1;
        }
        sellIn = sellIn - 1;

        if (sellIn < 0) {
            if (quality > 0) {
                quality = quality - 1;
            }
        }
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
