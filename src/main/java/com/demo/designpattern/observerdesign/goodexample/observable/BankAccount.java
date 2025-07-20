package com.demo.designpattern.observerdesign.goodexample.observable;

import com.demo.designpattern.observerdesign.goodexample.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private double balance;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        notifyObservers();
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            notifyObservers();
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
