package com.kurtulussahin.java.tdd.isbntools.test;
import com.kurtulussahin.java.tdd.isbntools.ValidatorISBN;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

public class ExampleTests {

    @Test
    public void checkValidISBN(){
        ValidatorISBN validator = new ValidatorISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue("First value" ,result);
        result = validator.checkISBN("0140177396");
        assertTrue("Second value", result);
    }

    @Test
    public void checkInValidISBN(){
        ValidatorISBN validator = new ValidatorISBN();
        boolean result = validator.checkISBN("0140449117");
        assertFalse(result);
    }

}
