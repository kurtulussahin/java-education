package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema32;

import org.junit.jupiter.api.Test;

class varargsExampleTest {

    @Test
    void sumTest() {

        varargsExample.sumTest(1,2,3);
        varargsExample.sumTest(1,2);
        varargsExample.sumTest(1,2,3,4,5);

    }
}