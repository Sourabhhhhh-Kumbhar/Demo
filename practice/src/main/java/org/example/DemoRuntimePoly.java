package org.example;

class Payment
{
    void pay()
    {
        System.out.println("Processing the payment....");
    }

    static class CreditCard extends Payment
    {
        @Override
        void pay()
        {
            System.out.println("Made the payment using CreditCard");
        }
    }

    static class UPI extends Payment
    {
        void pay()
        {
            System.out.println("Made the payment using UPI");
        }
    }

    static class Cash extends Payment
    {
        void pay()
        {
            System.out.println("Made the payment using Cash");
        }
    }
}

public class DemoRuntimePoly
{
    static void processPayment(Payment payment)
    {
        payment.pay();
    }

    public static void main(String[] args)
    {
        Payment payment1 = new Payment.CreditCard();
        Payment payment2 = new Payment.UPI();
        Payment payment3 = new Payment.Cash();

        processPayment(payment1);
        processPayment(payment2);
        processPayment(payment3);
    }
}
