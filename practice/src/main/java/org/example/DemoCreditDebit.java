package org.example;

public class DemoCreditDebit
{
    int balance = 500;

    void Credit()
    {
        System.out.println("Balance: " + balance);

        balance = balance + 2000;

        System.out.println("Balance after Credit: " + balance );
    }

    void Debit()
    {
        System.out.println("Balance before debit: " + balance );

        balance = balance - 1000;

        System.out.println("Balance after debit: " + balance );
    }

    public static void main(String[] args)
    {
        DemoCreditDebit d = new DemoCreditDebit();

        d.Credit();
        d.Debit();
    }
}

