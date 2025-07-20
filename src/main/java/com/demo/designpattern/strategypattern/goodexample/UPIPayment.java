package com.demo.designpattern.strategypattern.goodexample;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}
