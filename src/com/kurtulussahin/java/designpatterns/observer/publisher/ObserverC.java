package com.kurtulussahin.java.designpatterns.observer.publisher;

class ObserverC implements Observer{

    @Override
    public void update(String message){
        System.out.println("observerC: " + message);
    }
}
