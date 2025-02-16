package com.kurtulussahin.java.temeller.dependencyinjection.helloDI.withDI;

public class HelloTest {

    public static void main(String[] args) {

        IMessageWriter writer = new SecureMessageWriter(
                                    new ConsoleMesageWriter(),new Identity());
        Salutation salutation = new Salutation(writer);
        salutation.exlaim();
    }
}
