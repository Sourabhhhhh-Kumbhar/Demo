package org.example;

abstract class Paymentt
{
    abstract void pay(double amount);

    void message()
    {
        System.out.println("Processing Your Payment...");
    }
}

class UpiPayment extends Paymentt
{
    @Override
    void pay(double amount)
    {
        System.out.println("Paid Rs. " + amount + "Using Credit Card");
    }
}

class CardPayment extends Paymentt {

    @Override
    void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}

public class DemoAbstraction
{
    public static void main(String[] args)
    {
        Paymentt p = new UpiPayment();
        p.message();
        p.pay(500);

        p = new CardPayment();
        p.message();
        p.pay(1000);
    }
}
