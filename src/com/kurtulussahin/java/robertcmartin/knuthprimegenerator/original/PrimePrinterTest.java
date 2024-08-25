package com.kurtulussahin.java.robertcmartin.knuthprimegenerator.original;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class PrimePrinterTest {

  private PrintStream out;

  @Before
  public void setup() throws Exception {
    out = System.out;
    System.setOut(new PrintStream(new FileOutputStream("src/com/kurtulussahin/java/robertcmartin/knuthprimegenerator/lead")));
  }

  @After
  public void teardown() {
    System.setOut(out);
    new File("src/com/kurtulussahin/java/robertcmartin/knuthprimegenerator/lead").delete();
  }

  @Test
  public void makeSureOutputMatchesGold() throws Exception {
    PrimePrinter.main(new String[0]);
    BufferedReader lead = new BufferedReader(new FileReader("src/com/kurtulussahin/java/robertcmartin/knuthprimegenerator/lead"));
    BufferedReader gold = new BufferedReader(new FileReader("src/com/kurtulussahin/java/robertcmartin/knuthprimegenerator/gold"));
    String line;
    while ((line = gold.readLine()) != null) {
      assertEquals(line, lead.readLine());
    }
    assertEquals(null, lead.readLine());
  }

}
