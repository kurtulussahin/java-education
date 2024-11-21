package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StarbucksTest {
    @Test
    void starbucksBuilderCreatesTallLightAlmond() {
        Starbucks sb = new Starbucks.StarbucksBuilder("tall").buildBeanType("light").buildMilk("almond").build();

        assertEquals("tall", sb.getSize());
        assertEquals("light", sb.getBeanType());
        assertEquals("almond", sb.getMilkType());

    }
}