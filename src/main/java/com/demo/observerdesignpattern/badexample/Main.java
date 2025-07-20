package com.demo.observerdesignpattern.badexample;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(2000);
        account.withdraw(500);
    }
}
