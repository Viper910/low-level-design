package com.demo.designpattern.observerdesign.badexample;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(2000);
        account.withdraw(500);
    }
}
