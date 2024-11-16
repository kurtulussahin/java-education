package com.kurtulussahin.java.tdd.isbntools.test;

import com.kurtulussahin.java.tdd.isbntools.Book;
import com.kurtulussahin.java.tdd.isbntools.ExternalIsbnDataService;
import com.kurtulussahin.java.tdd.isbntools.StockManager;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StockManagementTests {

    @Test
    public void canGetACorrectLocatorCode(){

        ExternalIsbnDataService testWebService = new ExternalIsbnDataService() {
            @Override
            public Book lookUp(String isbn) {
                return new Book(isbn, "Of Mice And Mew", "J. Stainback");
            }
        };

        ExternalIsbnDataService testDatabaseService = new ExternalIsbnDataService() {
            @Override
            public Book lookUp(String isbn) {
                return null;
            }
        };

        StockManager stockManager = new StockManager();
        stockManager.setWebService(testWebService);
        stockManager.setDatabaseService(testDatabaseService);


        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("7396J4",locatorCode);

    }

    @Test
    public void databaseIsUsedIfDataIsPresent(){

    }

    @Test
    public void webServiseIsUsedIfDataIsNotPresentInDatabase(){

    }

}
