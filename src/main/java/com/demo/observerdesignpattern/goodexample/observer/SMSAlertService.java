package com.demo.observerdesignpattern.goodexample.observer;

import com.demo.observerdesignpattern.goodexample.observable.BankAccount;

public class SMSAlertService implements Observer {
    private final BankAccount account;

    public SMSAlertService(BankAccount account) {
        this.account = account;
    }

    @Override
    public void update() {
        System.out.println("[SMS] New Balance: " + account.getBalance());
    }
}


