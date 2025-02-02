package com.kurtulussahin.tdd.isbntools;

public interface ExternalIsbnDataService {
    public Book lookUp(String isbn);
}
