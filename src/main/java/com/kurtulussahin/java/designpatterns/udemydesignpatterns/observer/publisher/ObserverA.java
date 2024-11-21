package com.kurtulussahin.java.designpatterns.udemydesignpatterns.observer.publisher;

class ObserverA implements Observer{

    @Override
    public void update(String message){
        System.out.println("observerA: " + message);
    }
}