package com.demo.designpattern.observerdesign.badexample;


public class SMSAlertService {
    public void sendSMS(double balance) {
        System.out.println("[SMS] New balance: " + balance);
    }
}


