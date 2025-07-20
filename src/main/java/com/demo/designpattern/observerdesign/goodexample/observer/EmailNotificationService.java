package com.demo.designpattern.observerdesign.goodexample.observer;

import com.demo.designpattern.observerdesign.goodexample.observable.BankAccount;

public class EmailNotificationService implements Observer {
    private final BankAccount account;

    public EmailNotificationService(BankAccount account) {
        this.account = account;
    }

    @Override
    public void update() {
        System.out.println("[Email] New Balance: " + account.getBalance());
    }
}