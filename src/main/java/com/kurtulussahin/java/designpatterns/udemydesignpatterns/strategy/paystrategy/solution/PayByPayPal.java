package com.kurtulussahin.java.designpatterns.udemydesignpatterns.strategy.paystrategy.solution;

public class PayByPayPal implements PayStrategy {

    @Override
    public boolean pay(int paymentAmount) {
    	
        System.out.println("Paying " + paymentAmount + " using PayPal.");
        
        return true;
    }

}
