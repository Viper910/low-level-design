package com.demo.observerdesignpattern.goodexample;

import com.demo.observerdesignpattern.goodexample.observable.BankAccount;
import com.demo.observerdesignpattern.goodexample.observer.EmailNotificationService;
import com.demo.observerdesignpattern.goodexample.observer.Observer;
import com.demo.observerdesignpattern.goodexample.observer.SMSAlertService;

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
