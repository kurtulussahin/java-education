package com.kurtulussahin.java.temeller.dependencyinjection.helloDI.withDI;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SalutationTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    @Test
    public void testExlaim() {
        IMessageWriter fakeWriter = new FakeMessageWriter();
        Salutation salutation = new Salutation(fakeWriter);
        salutation.exlaim();
        Assert.assertEquals("Hello World!\n", outContent.toString());
    }
}