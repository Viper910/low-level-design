package com.demo.designpattern.observerdesign.badexample;

public class EmailNotificationService {
    public void sendEmail(double balance) {
        System.out.println("[Email] New balance: " + balance);
    }
}