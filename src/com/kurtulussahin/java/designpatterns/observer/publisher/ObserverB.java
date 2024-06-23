package com.kurtulussahin.java.designpatterns.observer.publisher;

class ObserverB implements Observer{

    @Override
    public void update(String message){
        System.out.println("observerB: " + message);
    }
}
