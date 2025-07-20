package com.demo.observerdesignpattern.badexample;


public class SMSAlertService {
    public void sendSMS(double balance) {
        System.out.println("[SMS] New balance: " + balance);
    }
}


