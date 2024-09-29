package com.kurtulussahin.java.codekata.emilybache.gildedrose;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GildedRoseApprovalTest {

	  private PrintStream out;

	  @Before
	  public void setup() throws Exception {
	    out = System.out;
	    System.setOut(new PrintStream(new FileOutputStream("src/com/kurtulussahin/java/codekata/emilybache/gildedrose/lead")));
	  }

	  @After
	  public void teardown() {
	    System.setOut(out);
	    new File("src/com/kurtulussahin/java/codekata/emilybache/gildedrose/lead").delete();
	  }

	  @Test
	  public void makeSureOutputMatchesGold() throws Exception {
		Program.main();
	    BufferedReader lead = new BufferedReader(new FileReader("src/com/kurtulussahin/java/codekata/emilybache/gildedrose/lead"));
	    BufferedReader gold = new BufferedReader(new FileReader("src/com/kurtulussahin/java/codekata/emilybache/gildedrose/gold"));
	    String line;
	    while ((line = gold.readLine()) != null) {
	      assertEquals(line, lead.readLine());
	    }
	    assertEquals(null, lead.readLine());
	  }


}
