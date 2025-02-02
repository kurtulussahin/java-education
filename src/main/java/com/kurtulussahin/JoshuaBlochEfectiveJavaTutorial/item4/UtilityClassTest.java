package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilityClassTest {

    @Test
    void shouldSumTwoNumber() {
        assertEquals(3,UtilityClass.sum(1,2));
    }
}