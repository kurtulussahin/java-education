package com.kurtulussahin.codekata.minepumpsystem.objectoriented;

public class DigitalOutput {

    private final String name;

    DigitalOutput(String name) {

        this.name = name;
    }

    public void write(String value) {

       System.out.println(name +":"+ value);
    }
}
