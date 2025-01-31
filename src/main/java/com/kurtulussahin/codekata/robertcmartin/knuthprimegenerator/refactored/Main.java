package com.kurtulussahin.codekata.robertcmartin.knuthprimegenerator.refactored;

import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args){
        // specify the file path
        String filePath = "/home/debian/IdeaProjects/java-education/src/main/java/com/kurtulussahin/java/codekata/robertcmartin/knuthprimegenerator/gold";
        System.out.println("Çalışma Dizini: " + System.getProperty("user.dir"));
        Path path = Path.of(filePath);
        System.out.println("Dosya Mevcut: " + Files.exists(path) + " - Yol: " + path.toAbsolutePath());

    }
}
