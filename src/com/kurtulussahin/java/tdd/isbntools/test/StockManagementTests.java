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
        ExternalIsbnDataService dbSevice = mock(ExternalIsbnDataService.class);
        ExternalIsbnDataService wbSevice = mock(ExternalIsbnDataService.class);

        when(dbSevice.lookUp("0140177396")).thenReturn(new Book("0140177396", "abc", "abc"));

        StockManager stockManager = new StockManager();
        stockManager.setWebService(wbSevice);
        stockManager.setDatabaseService(dbSevice);

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);

        verify(dbSevice, times(1)).lookUp("0140177396");
        verify(wbSevice, never()).lookUp(anyString());
    }

    @Test
    public void webServiseIsUsedIfDataIsNotPresentInDatabase(){
        ExternalIsbnDataService dbSevice = mock(ExternalIsbnDataService.class);
        ExternalIsbnDataService wbSevice = mock(ExternalIsbnDataService.class);

        when(dbSevice.lookUp("0140177396")).thenReturn(null);
        when(wbSevice.lookUp("0140177396")).thenReturn(new Book("0140177396", "abc", "abc"));

        StockManager stockManager = new StockManager();
        stockManager.setWebService(wbSevice);
        stockManager.setDatabaseService(dbSevice);

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);

        verify(dbSevice).lookUp("0140177396");
        verify(wbSevice).lookUp("0140177396");
    }
}
