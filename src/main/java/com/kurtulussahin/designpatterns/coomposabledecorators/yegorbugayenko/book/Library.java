package com.kurtulussahin.designpatterns.coomposabledecorators.yegorbugayenko.book;

import java.util.Collections;
import java.util.List;

public class Library {

    private final List<Book> books;

    public Library(final List<Book> books){
        this.books = Collections.unmodifiableList(books);
    }

    public String json(){
        final StringBuilder json = new StringBuilder();
        json.append("[");
        for (Book book : this.books) {
            json.append(book.json()).append(",");
        }
        json.deleteCharAt(json.length() - 1);
        json.append("]");
        return json.toString();
    }
}
