package com.demo.observerdesignpattern.goodexample.observer;

import com.demo.observerdesignpattern.goodexample.observable.BankAccount;

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