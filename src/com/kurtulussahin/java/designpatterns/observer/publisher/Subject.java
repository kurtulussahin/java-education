package com.kurtulussahin.java.designpatterns.observer.publisher;

interface Subject{
    //call attach() to add observers to the observer list
    public void attach(Observer observer);
    
    //call detach() to remove observers from the observer list
    public void detach(Observer observer);

    //call notify() to publish all the changes made by the subject
    public void notify(String message);
}
