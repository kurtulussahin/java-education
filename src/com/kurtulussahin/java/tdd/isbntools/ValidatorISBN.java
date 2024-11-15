package com.kurtulussahin.java.tdd.isbntools;

public class ValidatorISBN {

    public static final int LONG_ISBN_LENGTH = 13;
    public static final int SHORT_ISBN_LENGTH = 10;
    public static final int SHORT_ISBN_MULTIPLIER = 11;
    private static final int LONG_ISBN_MULTIPLIER = 10;

    public boolean checkISBN(String isbn) {

        if(isbn.length()== LONG_ISBN_LENGTH){
            return (isThisValid13DigitIsbn(isbn));
        }else {
            if (isbn.length() != SHORT_ISBN_LENGTH) throw new NumberFormatException("ISBN numbers must be 10 digits long");
            return (isThisValid10DigitIsbn(isbn));
        }
    }

    private static boolean isThisValid10DigitIsbn(String isbn) {
        int total = 0;

        for (int i = 0; i < SHORT_ISBN_LENGTH; i++) {
            if (!Character.isDigit(isbn.charAt(i))) {
                if (i == 9 && isbn.charAt(i) == 'X') {
                    total += SHORT_ISBN_LENGTH;
                } else {
                    throw new NumberFormatException("ISBN numbers can only contain numeric digits");
                }
            } else {
                total += Character.getNumericValue(isbn.charAt(i)) * (SHORT_ISBN_LENGTH - i);
            }
        }

        if (total % SHORT_ISBN_MULTIPLIER == 0) {
            return true;
        }
        return false;
    }

    private static boolean isThisValid13DigitIsbn(String isbn) {
        int total=0;
        for(int i = 0; i< LONG_ISBN_LENGTH; i++){
            if(i%2==0){
                total += Character.getNumericValue(isbn.charAt(i));
            }else {
                total += Character.getNumericValue(isbn.charAt(i))*3;
            }
        }

        if (total % LONG_ISBN_MULTIPLIER == 0) {
            return true;
        }
        return false;
    }
}
