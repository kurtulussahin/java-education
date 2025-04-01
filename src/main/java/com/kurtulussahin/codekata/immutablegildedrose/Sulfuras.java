package com.kurtulussahin.codekata.immutablegildedrose;

public class Sulfuras implements Item{

    private final String name;
    private final int sellIn;
    private final int quality;

    public Sulfuras(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public Item update() {
        //Sulfuras does not get updated
        return this;
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
