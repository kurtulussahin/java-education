package com.kurtulussahin.java.temeller.dependencyinjection.helloDI.withDI;

public class Salutation {

    IMessageWriter writer;

    public Salutation(IMessageWriter writer){
        this.writer=writer;
    }

    public void exlaim(){
        writer.write("Hello World!");
    }
}
