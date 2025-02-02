package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema50;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DefansiveDateTest {

    @Test
    void testDefansiveDateCopy() {
        Date date1=new Date();
        Date date2=date1;
        Date date3=new Date(date1.getTime());

        assertTrue(date1==date2);
        assertFalse(date1==date3);
        assertTrue(date1.equals(date3));
    }
}