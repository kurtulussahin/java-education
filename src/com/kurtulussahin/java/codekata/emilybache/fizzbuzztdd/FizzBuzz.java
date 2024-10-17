package com.kurtulussahin.java.codekata.emilybache.fizzbuzztdd;

import java.io.PrintStream;

public class FizzBuzz {

    public static  void main(String[] args){
        new FizzBuzz().print(System.out);
    }
    public String convert(int i){
        if(i%15==0){
            return "FizzBuzz";
        }

        if(i%3==0){
            return "Fizz";
        }
        if(i%5==0){
            return "Buzz";
        }
        return "" +i;
    }

    public void print(PrintStream out) {
        for(int i=1; i<=100; i++) {
            out.println(convert(i));
        }
    }
}
