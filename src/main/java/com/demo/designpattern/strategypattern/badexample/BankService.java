package com.demo.designpattern.strategypattern.badexample;

public class BankService {

    public void makePayment(String paymentType, double amount) {
        if (paymentType.equalsIgnoreCase("UPI")) {
            System.out.println("Paid " + amount + " using UPI.");
            // UPI payment logic here
        } else if (paymentType.equalsIgnoreCase("CREDIT_CARD")) {
            System.out.println("Paid " + amount + " using Credit Card.");
            // Credit Card payment logic here
        } else if (paymentType.equalsIgnoreCase("NET_BANKING")) {
            System.out.println("Paid " + amount + " using Net Banking.");
            // Net Banking payment logic here
        } else {
            System.out.println("Invalid payment type!");
        }
    }
}
