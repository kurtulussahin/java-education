package com.kurtulussahin.java.designpatterns.strategy.paystrategy.solution;

public class PayByPayPal implements PayStrategy {

    @Override
    public boolean pay(int paymentAmount) {
    	
        System.out.println("Paying " + paymentAmount + " using PayPal.");
        
        return true;
    }

}
