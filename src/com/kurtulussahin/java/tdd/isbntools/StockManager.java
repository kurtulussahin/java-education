package com.kurtulussahin.java.tdd.isbntools;

public class StockManager {

    private ExternalIsbnDataService service;

    public void setService(ExternalIsbnDataService service) {
        this.service = service;
    }

    public String getLocatorCode(String isbn) {
        Book book = service.lookUp(isbn);
        StringBuilder locator = new StringBuilder();
        locator.append(isbn.substring(isbn.length()-4));
        locator.append(book.getAuthor().substring(0,1));
        locator.append(book.getTitle().split(" ").length);

        return locator.toString();

    }
}
