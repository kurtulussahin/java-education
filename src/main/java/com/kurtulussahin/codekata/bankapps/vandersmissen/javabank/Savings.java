package com.kurtulussahin.codekata.bankapps.vandersmissen.javabank;

public class Savings extends Account{
    private static String accountType="Savings";
    public Savings(double initialDeposit) {
        super();
        this.setBalance(initialDeposit);
        if(initialDeposit>1000){
            this.setInterest(5);
        }else{
            this.setInterest(2);
        }
    }

    @Override
    public String toString(){
        return "Account type: " + accountType + "Account\n" +
                "Account number: " + this.getAccountNumber() + "\n" +
                "Balance: " + this.getBalance() + "\n" +
                "Interest rate: " + this.getInterest() + "\n";
    }
}
