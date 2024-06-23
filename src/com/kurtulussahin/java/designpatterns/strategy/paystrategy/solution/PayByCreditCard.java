package com.kurtulussahin.java.designpatterns.strategy.paystrategy.solution;

public class PayByCreditCard implements PayStrategy {

    @Override
    public boolean pay(int paymentAmount) {
       
         System.out.println("Paying " + paymentAmount + " using Credit Card.");
         return true;
    }

}
