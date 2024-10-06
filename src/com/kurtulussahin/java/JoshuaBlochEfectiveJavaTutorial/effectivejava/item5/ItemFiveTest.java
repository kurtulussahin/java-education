package com.kurtulussahin.java.JoshuaBlochEfectiveJavaTutorial.effectivejava.item5;

public class ItemFiveTest {

    public static void main(String[] args) {

        TurkishDictionaryUtility.getSynonym("göz");
        TurkishDictionaryUtilitySingleton.getInstance().getSynonym("göz");


        DictionaryUtilityDependencyInjection dictUtility = new DictionaryUtilityDependencyInjection(new Dictionary("Turkish"));
        dictUtility.getSynonym("göz");


    }

}
