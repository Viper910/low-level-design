package com.demo.designpattern.observerdesign.goodexample;

import com.demo.designpattern.observerdesign.goodexample.observable.BankAccount;
import com.demo.designpattern.observerdesign.goodexample.observer.Observer;
import com.demo.designpattern.observerdesign.goodexample.observer.EmailNotificationService;
import com.demo.designpattern.observerdesign.goodexample.observer.SMSAlertService;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Observer sms = new SMSAlertService(account);
        Observer email = new EmailNotificationService(account);

        account.addObserver(sms);
        account.addObserver(email);

        account.deposit(1000);
        account.withdraw(200);
    }
}
