package com.demo.observerdesignpattern.badexample;

public class BankAccount {
    private double balance;

    private SMSAlertService smsAlertService;
    private EmailNotificationService emailNotificationService;

    public BankAccount() {
        this.smsAlertService = new SMSAlertService();
        this.emailNotificationService = new EmailNotificationService();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);

        // Hardcoded direct calls — bad!
        smsAlertService.sendSMS(balance);
        emailNotificationService.sendEmail(balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);

            // Hardcoded direct calls — bad!
            smsAlertService.sendSMS(balance);
            emailNotificationService.sendEmail(balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
