package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Item3Test {

    @Test
    void getInstanceOfStaticInitializeSingletonCreatesSingleInstance() {
        assertEquals(StaticInitializeSingleton.getInstance(),StaticInitializeSingleton.getInstance());
    }

    @Test
    void getInstanceOfLazyCacheSingletonCreatesSingleInstance() {
        assertEquals(LazyCache.getInstance(),LazyCache.getInstance());

    }
}