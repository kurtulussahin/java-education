package com.kurtulussahin.designpatterns.coomposabledecorators.yegorbugayenko.book;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String json(){
        return String.format(
            "{\n\t\"title\": \"%s\",\n\t\"author\": \"%s\"\n}",
            this.title, this.author
        );
    }
}
