package com.kurtulussahin.java.tdd.isbntools.test;

import com.kurtulussahin.java.tdd.isbntools.Book;
import com.kurtulussahin.java.tdd.isbntools.ExternalIsbnDataService;
import com.kurtulussahin.java.tdd.isbntools.StockManager;
import org.junit.Test;
import static org.junit.Assert.*;

public class StockManagementTests {

    @Test
    public void canGetACorrectLocatorCode(){

        ExternalIsbnDataService testService = new ExternalIsbnDataService() {
            @Override
            public Book lookUp(String isbn) {
                return new Book(isbn, "Of Mice And Mew", "J. Stainback");
            }
        };
        StockManager stockManager = new StockManager();
        stockManager.setService(testService);

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("7396J4",locatorCode);

    }

}
