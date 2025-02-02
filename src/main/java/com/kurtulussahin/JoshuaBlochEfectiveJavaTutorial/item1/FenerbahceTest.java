package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.item1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FenerbahceTest {

    @Test
    void yeniFutbolcuUretCreatesPlayerAtAge22() {
        Fenerbahce player = Fenerbahce.yeniFutbolcuUret("22");
        assertEquals(22,player.getAge());
    }

}