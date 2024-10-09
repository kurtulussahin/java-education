package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.itema32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class varargsExampleTest {

    @Test
    void sumTest() {

        varargsExample.sumTest(1,2,3);
        varargsExample.sumTest(1,2);
        varargsExample.sumTest(1,2,3,4,5);

    }
}