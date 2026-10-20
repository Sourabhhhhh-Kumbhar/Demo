package org.example;

// Abstract class defines a common structure for payments
abstract class Paymentt {

    // Abstract method must be implemented by child classes
    abstract void pay(double amount);

    // Common method shared by all payment types
    void message() {
        System.out.println("Processing your payment...");
    }
}

// UPI payment implementation
class UpiPayment extends Paymentt {

    @Override
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }
}

// Credit card payment implementation
class CardPayment extends Paymentt {

    @Override
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}

// Main class
public class DemoAbstraction {

    public static void main(String[] args) {

        // Parent class reference refers to a UPI payment object
        Paymentt p = new UpiPayment();
        p.message();
        p.pay(500);

        // Same reference now refers to a credit card payment object
        p = new CardPayment();
        p.message();
        p.pay(1000);
    }
}