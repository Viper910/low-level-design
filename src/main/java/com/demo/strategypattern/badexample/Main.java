package com.demo.strategypattern.badexample;

public class Main {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        bankService.makePayment("UPI", 1000);
        bankService.makePayment("CREDIT_CARD", 2500);
        bankService.makePayment("NET_BANKING", 5000);
    }
}
