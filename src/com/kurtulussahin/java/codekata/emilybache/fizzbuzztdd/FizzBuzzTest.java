package com.kurtulussahin.java.codekata.emilybache.fizzbuzztdd;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*

1->1
2->2
3->Fizz
4->4
5->Buzz
...
15->FizzBuzz
...

*/

public class FizzBuzzTest {


    @Test
    void ordinaryNumbersArePreserved(){
        assertEquals("1", new FizzBuzz().convert(1));
        assertEquals("2", new FizzBuzz().convert(2));
    }

    @Test
    void fizzNumbersAreMultiplesOfThree(){

        assertEquals("Fizz", new FizzBuzz().convert(3));
        assertEquals("Fizz", new FizzBuzz().convert(6));
    }

    @Test
    void buzzNumbersAreMultiplesOfFive(){

        assertEquals("Buzz", new FizzBuzz().convert(5));
        assertEquals("Buzz", new FizzBuzz().convert(10));
    }

    @Test
    void fizzBuzzNumbersAreMultiplesOfThreeAndFive(){

        assertEquals("FizzBuzz", new FizzBuzz().convert(15));
        assertEquals("FizzBuzz", new FizzBuzz().convert(30));
    }

    @Test
    void printAllTheNumbersTo100() throws UnsupportedEncodingException {
        var storage = new ByteArrayOutputStream();
        var out = new PrintStream(storage);
        new FizzBuzz().print(out);
        var result = storage.toString("utf-8");
        assertEquals("1\n", result.substring(0,2));
        assertEquals(100, result.split("\n").length);
        assertEquals("Buzz\n", result.substring(result.length()-5));

    }
}
