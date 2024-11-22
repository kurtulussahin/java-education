package com.kurtulussahin.codekata.robertcmartin.knuthprimegenerator.original;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PrimePrinterTest {

  private PrintStream out;

  @Before
  public void setup() throws Exception {
    out = System.out;
   System.setOut(new PrintStream(new FileOutputStream("src/main/java/com/kurtulussahin/codekata/robertcmartin/knuthprimegenerator/lead")));

  }

  @After
  public void teardown() {
    System.setOut(out);
    new File("src/main/java/com/kurtulussahin/codekata/robertcmartin/knuthprimegenerator/lead").delete();

  }

  @Test
  public void makeSureOutputMatchesGold() throws Exception {
    PrimePrinter.main(new String[0]);
    BufferedReader lead = new BufferedReader(new FileReader("src/main/java/com/kurtulussahin/codekata/robertcmartin/knuthprimegenerator/lead"));
    BufferedReader gold = new BufferedReader(new FileReader("src/main/java/com/kurtulussahin/codekata/robertcmartin/knuthprimegenerator/gold"));

    String line;
    while ((line = gold.readLine()) != null) {
      assertEquals(line, lead.readLine());
    }
    assertEquals(null, lead.readLine());
  }

}
