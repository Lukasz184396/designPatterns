package com.zawadalukasz.behavioral.observer.abstraction;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
