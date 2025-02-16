package com.kurtulussahin.java.temeller.dependencyinjection.helloDI.withDI;

public class FakeMessageWriter implements IMessageWriter {

    public FakeMessageWriter(){

    }
    @Override
    public void write(String helloWorld) {
        System.out.println("Hello World!");
    }
}
