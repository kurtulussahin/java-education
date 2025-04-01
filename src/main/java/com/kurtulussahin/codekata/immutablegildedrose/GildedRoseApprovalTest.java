package com.kurtulussahin.codekata.immutablegildedrose;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class GildedRoseApprovalTest {

	  private PrintStream out;

	  @Before
	  public void setup() throws Exception {
	    out = System.out;
	    System.setOut(new PrintStream(new FileOutputStream("src/main/java/com/kurtulussahin/codekata/immutablegildedrose/lead")));
	  }

	  @After
	  public void teardown() {
	    System.setOut(out);
	    new File("src/main/java/com/kurtulussahin/codekata/immutablegildedrose/lead").delete();
	  }

	  @Test
	  public void makeSureOutputMatchesgildedRoseOutputTestFile() throws Exception {
		Program.main();
	    BufferedReader lead = new BufferedReader(new FileReader("src/main/java/com/kurtulussahin/codekata/immutablegildedrose/lead"));
	    BufferedReader gold = new BufferedReader(new FileReader("src/main/java/com/kurtulussahin/codekata/immutablegildedrose/gildedRoseOutputTestFile"));
	    String line;
	    while ((line = gold.readLine()) != null) {
	      assertEquals(line, lead.readLine());
	    }
	    assertEquals(null, lead.readLine());
	  }


}
