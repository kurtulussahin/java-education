package com.kurtulussahin.java.tdd.isbntools.test;

import com.kurtulussahin.java.tdd.isbntools.Book;
import com.kurtulussahin.java.tdd.isbntools.ExternalIsbnDataService;
import com.kurtulussahin.java.tdd.isbntools.StockManager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class StockManagementTests {

    ExternalIsbnDataService testWebService;
    ExternalIsbnDataService testDatabaseService;

    StockManager stockManager;

    @Before
    public void setup() {

        testWebService = mock(ExternalIsbnDataService.class);
        testDatabaseService = mock(ExternalIsbnDataService.class);

        stockManager = new StockManager();
        stockManager.setWebService(testWebService);
        stockManager.setDatabaseService(testDatabaseService);
    }

    @Test
    public void canGetACorrectLocatorCode() {

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

        stockManager.setWebService(testWebService);
        stockManager.setDatabaseService(testDatabaseService);

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("7396J4", locatorCode);
    }

    @Test
    public void canGetACorrectLocatorCodeWithMockitoStub() {

        when(testWebService.lookUp(anyString())).thenReturn(new Book("0140177396", "Of Mice And Mew", "J. Stainback"));
        when(testDatabaseService.lookUp(anyString())).thenReturn(null);

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);

        assertEquals("7396J4", locatorCode);
    }

    @Test
    public void databaseIsUsedIfDataIsPresent() {

        when(testDatabaseService.lookUp("0140177396")).thenReturn(new Book("0140177396", "abc", "abc"));

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);

        verify(testDatabaseService, times(1)).lookUp("0140177396");
        verify(testWebService, never()).lookUp(anyString());
    }

    @Test
    public void webServiseIsUsedIfDataIsNotPresentInDatabase() {

        when(testDatabaseService.lookUp("0140177396")).thenReturn(null);
        when(testWebService.lookUp("0140177396")).thenReturn(new Book("0140177396", "abc", "abc"));

        String isbn = "0140177396";
        String locatorCode = stockManager.getLocatorCode(isbn);

        verify(testDatabaseService).lookUp("0140177396");
        verify(testWebService).lookUp("0140177396");
    }
}
