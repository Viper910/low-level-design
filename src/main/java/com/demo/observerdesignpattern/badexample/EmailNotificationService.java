package com.demo.observerdesignpattern.badexample;

public class EmailNotificationService {
    public void sendEmail(double balance) {
        System.out.println("[Email] New balance: " + balance);
    }
}