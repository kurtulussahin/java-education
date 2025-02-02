package com.kurtulussahin.designpatterns.udemydesignpatterns.observer.publisher;

interface Observer{

    //call update() to inform all the observers about the chnages in the subject
    public void update(String message);
}