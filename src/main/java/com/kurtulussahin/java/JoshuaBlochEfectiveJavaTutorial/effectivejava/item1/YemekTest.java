package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item1;

import org.junit.Test;

import static org.junit.Assert.*;


public class YemekTest {

    @Test
    public void sogukYemekCreatesDondurmaInstance() {
        assertEquals(Dondurma.class, Yemek.sogukYemek().getClass());

    }

    @Test
    public void sicakYemekCreatesPideInstance() {
        assertEquals(Pide.class, Yemek.sicakYemek().getClass());
    }
}