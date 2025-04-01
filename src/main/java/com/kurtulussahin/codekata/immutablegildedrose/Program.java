package com.kurtulussahin.codekata.immutablegildedrose;

public class Program {

    public static void main(String... args) {
        System.out.println("OMGHAI!");

        new GildedRose
                (
                        new Item[]
                                {
                                        new Default("+5 Dexterity Vest", 10, 20),
                                        new AgedBrie("Aged Brie", 2, 0),
                                        new Default("Elixir of the Mongoose", 5, 7),
                                        new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
                                        new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
                                        new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                                        new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                                        new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                                        new Default("Conjured Mana Cake", 3, 6)
                                }
                ).run(31);
    }
}
