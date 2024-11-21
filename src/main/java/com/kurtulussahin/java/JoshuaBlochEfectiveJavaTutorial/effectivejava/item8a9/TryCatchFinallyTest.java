package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item8a9;


import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TryCatchFinallyTest {

    @Test(expected = ArithmeticException.class)
    public void basicTryCatchFinally_FinallyRuns() {
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println("catch block");
        } finally {
            System.out.println("Ben hep çalışırım");
        }
    }

    @Test
    public void basicTryCatchFinally_CatchAndFinallyRuns() {
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (ArithmeticException e) {
            System.out.println("catch block");
        } finally {
            System.out.println("Ben hep çalışırım");
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void lostTryErrorSeeFinallyError() {
        try {
            int data = 25 / 0;
            System.out.println(data);
        } catch (NullPointerException e) {
            System.out.println("catch block");
        } finally {
            int[] anArray = new int[1];
            System.out.println(anArray[10]);
            System.out.println("Ben hep çalışırım");
        }
    }


    @Test
    public void basicTryCatchFinally_ManuallyCloseBufferedReader() throws IOException {
        String path = "src/main/java/com/kurtulussahin/java/JoshuaBlochEfectiveJavaTutorial/effectivejava/item8a9/test.txt";
        String defaultVal= "aValue";
        BufferedReader br = new BufferedReader(new FileReader(path));
        try
        {
             br.readLine();
        }
        catch (IOException e)
        {
            System.out.println(defaultVal);
        }
        finally
        {
            // TODO: handle exception
            br.close();
            System.out.println("BufferedReader closed manually in finally block");
        }
    }

    @Test
    public void basicTryCatchFinally_Resources_AutomaticlyCloseBufferedReader_NoFinally() throws IOException {
        String path = "/path";
        String defaultVal= "aValue";
        try (BufferedReader aBufferedReader = new BufferedReader(new FileReader(path)))
        {
            aBufferedReader.readLine();
        }
        catch (IOException e)
        {
            System.out.println(defaultVal);
        }
    }
}