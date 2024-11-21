package com.kurtulussahin.java.temeller.helloworld;

public class SelamTest {

    public static void main(String[] args) {
        Selam nesne = new Selam();

        String cevap = nesne.selamSoyle("Ali ");
        System.out.println(cevap);

        cevap = nesne.selamSoyle("Zeynep");
        System.out.println(cevap);

        System.out.println("World: " + nesne.world);

        cevap = nesne.selamSoyle("");
        System.out.println(cevap);
    }
}

