package com.kurtulussahin.java.codekata.emilybache.fizzbuzztdd;

import org.junit.jupiter.api.Test;

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
}
