package com.kurtulussahin.designpatterns.coomposabledecorators.yegorbugayenko.textexample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

final class Text implements IText {
    private final File file;

    public Text(File src) {
        this.file = src;
    }

    @Override
    public String read() {
        try {
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

final class PrintableText implements IText {
    private final IText origin;

    public PrintableText(final IText text) {
        this.origin = text;
    }

    @Override
    public String read() {
        return origin.read().replaceAll("[^\\x20-\\x7E]", "");
    }
}

final class UpperCaseText implements IText {
    private final IText origin;

    public UpperCaseText(final IText text) {
        this.origin = text;
    }

    @Override
    public String read() {
        return origin.read().toUpperCase();
    }
}

final class TextInString implements IText {
    private final String text;

    public TextInString(String text) {
        this.text = text;
    }

    @Override
    public String read() {
        return text;
    }
}

final class TrimmedText implements IText {
    private final IText origin;

    public TrimmedText(final IText text) {
        this.origin = text;
    }

    @Override
    public String read() {
        return origin.read().trim();
    }
}

