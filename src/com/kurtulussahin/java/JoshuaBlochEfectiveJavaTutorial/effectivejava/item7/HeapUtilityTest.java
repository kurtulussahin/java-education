package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapUtilityTest {

    //Run if you have time
    @Test
    void outOfMemoryErrorCreator() {
        HeapUtility.heapLoader(1000000);
    }

    @Test
    void heapLoader() {
        //TODO
    }
}