package com.kurtulussahin.java.temeller.dependencyinjection.helloDI.withDI;

public class SecureMessageWriter implements IMessageWriter {

    private final IMessageWriter writer;
    private final Identity identity;

    public SecureMessageWriter( IMessageWriter writer, Identity identity) {
        this.writer = writer;
        this.identity = identity;
    }

    @Override
    public void write(String helloWorld) {
        writer.write("Hello World");
    }
}
