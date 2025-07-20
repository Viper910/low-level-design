package com.demo.designpattern.strategypattern.goodexample;

public class BankService {
    private PaymentStrategy paymentStrategy;

    // You can set the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set!");
        }
        paymentStrategy.pay(amount);
    }
}
