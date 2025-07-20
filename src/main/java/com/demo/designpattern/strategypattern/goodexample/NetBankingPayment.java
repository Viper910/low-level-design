package com.demo.designpattern.strategypattern.goodexample;

public class NetBankingPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking.");
    }
}