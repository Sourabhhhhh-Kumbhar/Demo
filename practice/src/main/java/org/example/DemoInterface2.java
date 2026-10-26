package org.example;

interface Paymenttt
{
    void pay(double amount);        //Defines the payment contract
}

class UpiPaymentt implements Paymenttt
{
    @Override
    public void pay(double amount)
    {
        System.out.println("Paid: " + amount + "Using UPI");
    }
}

class CardPaymentt implements Paymenttt
{
    @Override
    public void pay(double amount)
    {
       System.out.println("Paid: " + amount + "Using Card");
    }
}

public class DemoInterface2
{
    public static void main(String[] args)
    {
        Paymenttt p1 = new UpiPaymentt();       //Creates the Upi Implementation
        Paymenttt p2 = new CardPaymentt();      //Creates the Card Implementaion

        p1.pay(500);        //Executes the UpiPayemnt method
        p2.pay(100);        //Executes the CardPayement method
    }
}

