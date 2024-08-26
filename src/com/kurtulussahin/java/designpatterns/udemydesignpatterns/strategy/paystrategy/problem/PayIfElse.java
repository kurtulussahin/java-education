package com.kurtulussahin.java.designpatterns.udemydesignpatterns.strategy.paystrategy.problem;

public class PayIfElse {
	
	 public boolean pay(int paymentAmount, String paymentMethodType) {
		 
		 if(paymentMethodType=="Card") {		 
			 System.out.println("Paying " + paymentAmount + " using Card.");
			 
		 }else if(paymentMethodType=="Paypal") {			 
			 System.out.println("Paying " + paymentAmount + " using PayPal.");	
			 
		 }else {			 
			 System.out.println("Payment Method cant find !!!");
			 return false;
		 }
	     
	        
	     return true;
	  }

}
