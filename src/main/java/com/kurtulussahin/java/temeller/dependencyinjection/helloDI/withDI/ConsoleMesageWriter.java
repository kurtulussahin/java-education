package com.kurtulussahin.java.temeller.dependencyinjection.helloDI.withDI;

public class ConsoleMesageWriter implements IMessageWriter{

    public ConsoleMesageWriter() {
    }

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
