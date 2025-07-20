package com.demo.observerdesignpattern.goodexample.observable;

import com.demo.observerdesignpattern.goodexample.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
