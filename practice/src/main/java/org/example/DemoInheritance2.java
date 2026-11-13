package org.example;

class Paayment {

    // Parent class method
    void pay(double amount) {
        System.out.println("Processing payment...");
    }
}


// Child class 1
class UpiPaayment extends Paayment {

    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}


// Child class 2
class CarddPayment extends Paayment {

    @Override
    void pay(double amount)
    {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}


// Child class 3
class CashPayment extends Paayment
{

    @Override
    void pay(double amount)
    {
        System.out.println("Paid Rs." + amount + " using Cash");
    }
}


// Main class
public class DemoInheritance2
{

    public static void main(String[] args)
    {

        // Parent reference, child objects
        Paayment payment;

        payment = new UpiPaayment();
        payment.pay(500);

        payment = new CarddPayment();
        payment.pay(1000);

        payment = new CashPayment();
        payment.pay(200);
    }
}
