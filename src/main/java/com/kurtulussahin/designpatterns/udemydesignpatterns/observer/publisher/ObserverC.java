package com.kurtulussahin.designpatterns.udemydesignpatterns.observer.publisher;

class ObserverC implements Observer{

    @Override
    public void update(String message){
        System.out.println("observerC: " + message);
    }
}
