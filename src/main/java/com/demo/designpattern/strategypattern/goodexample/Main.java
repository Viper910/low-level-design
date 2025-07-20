package com.demo.designpattern.strategypattern.goodexample;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        // Pay using UPI
        bankService.setPaymentStrategy(new UPIPayment());
        bankService.makePayment(1000);

        // Switch to Credit Card
        bankService.setPaymentStrategy(new CreditCardPayment());
        bankService.makePayment(2500);

        // Switch to Net Banking
        bankService.setPaymentStrategy(new NetBankingPayment());
        bankService.makePayment(5000);
    }
}
