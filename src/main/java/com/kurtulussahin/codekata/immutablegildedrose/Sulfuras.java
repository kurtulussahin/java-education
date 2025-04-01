package com.kurtulussahin.codekata.immutablegildedrose;

public class Sulfuras implements Item{

    public String name;
    public int sellIn;
    public int quality;

    public Sulfuras(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public void update() {
        //Sulfuras does not get updated
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
