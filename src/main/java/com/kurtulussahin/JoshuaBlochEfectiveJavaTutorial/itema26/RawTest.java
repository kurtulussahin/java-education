package com.kurtulussahin.JoshuaBlochEfectiveJavaTutorial.itema26;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class RawTest {

    @Test (expected=ClassCastException.class)
    public void shouldThrowErrorRawType(){
        List<String> strings = new ArrayList<>();
        Raw.unsafeAdd(strings, Integer.valueOf(42));
        String s = strings.get(0); // Has compiler-generated cast
    }

}