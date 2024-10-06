package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YemekTest {

    @Test
    void sogukYemekCreatesDondurmaInstance() {
        assertInstanceOf(Dondurma.class, Yemek.sogukYemek());

    }

    @Test
    void sicakYemekCreatesPideInstance() {
        assertInstanceOf(Pide.class, Yemek.sicakYemek());
    }
}