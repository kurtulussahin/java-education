package com.kurtulussahin.java.tdd.isbntools;

public class StockManager {

    private ExternalIsbnDataService webService;
    private ExternalIsbnDataService databaseService;

    public void setWebService(ExternalIsbnDataService webService) {
        this.webService = webService;
    }

    public void setDatabaseService(ExternalIsbnDataService databaseService) {
        this.databaseService = databaseService;
    }

    public String getLocatorCode(String isbn) {

        Book book = databaseService.lookUp(isbn);
        if(book==null) book=webService.lookUp(isbn);

        StringBuilder locator = new StringBuilder();
        locator.append(isbn.substring(isbn.length()-4));
        locator.append(book.getAuthor().substring(0,1));
        locator.append(book.getTitle().split(" ").length);

        return locator.toString();

    }


}
