package com.kurtulussahin.designpatterns.coomposabledecorators.yegorbugayenko.textexample;

public class TextTest {

    public static void main(String[] args) {
        String rawText = " \uD83D\uDE05 Hello, world!";

        IText text = new TextInString(rawText);
        System.out.println(text.read());

        text = new PrintableText(
                    new TextInString(rawText));
        System.out.println(text.read());

        text = new UpperCaseText(
                    new PrintableText(
                        new TextInString(
                                rawText)));
        System.out.println(text.read());

        text = new TrimmedText(
                    new UpperCaseText(
                        new PrintableText(
                            new TextInString(
                                    rawText))));
        System.out.println(text.read());
    }
}
