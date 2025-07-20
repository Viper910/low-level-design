package com.demo.designpattern.observerdesign.goodexample.observable;

import com.demo.designpattern.observerdesign.goodexample.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
