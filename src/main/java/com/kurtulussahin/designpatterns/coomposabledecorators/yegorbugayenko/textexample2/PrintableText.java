package com.kurtulussahin.designpatterns.coomposabledecorators.yegorbugayenko.textexample2;

public class PrintableText implements Text {
    private final Text text;

    public PrintableText(final Text txt){
        this.text = txt;
    }


    @Override
    public String read() {
        return  this.text.read().replaceAll("[^\\x20-\\x7E]", "");
    }
}
