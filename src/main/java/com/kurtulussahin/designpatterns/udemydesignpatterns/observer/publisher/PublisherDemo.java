package com.kurtulussahin.designpatterns.udemydesignpatterns.observer.publisher;

public class PublisherDemo {

	public static void main(String[] args) {
		ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();
        ObserverC c = new ObserverC();
    
        ConcreteSubject publisher = new ConcreteSubject();
        publisher.attach(a);
        publisher.attach(b);
    
        publisher.notify("First update\n");
    
        publisher.attach(c);
        publisher.detach(b);
        publisher.notify("Second update\n");
    
    }
}