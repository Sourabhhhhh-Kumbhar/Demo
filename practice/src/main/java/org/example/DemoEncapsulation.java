package org.example;

class BankAccount
{
    // Fields are private — no outside class can access them directly.
    // This is the core of encapsulation: hide the internal state.
    private String accountHolder;
    private double balance;

    // Constructor to initialize the object safely
    public BankAccount(String accountHolder, double balance)
    {
        this.accountHolder = accountHolder;
        // Validate even at construction time
        this.balance = (balance >= 0) ? balance : 0;
    }

    // Public getter — controlled READ access to a private field
    public double getBalance()
    {
        return balance;
    }

    public String getAccountHolder()
    {
        return accountHolder;
    }

    // Public setter — controlled WRITE access, with validation.
    // Outside code can't just do account.balance = -500;
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
        }
        else
        {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount)
    {
        if (amount <= 0)
        {
            System.out.println("Withdrawal amount must be positive.");
        }
        else if (amount > balance)
        {
            System.out.println("Insufficient funds.");
        }
        else
        {
            balance -= amount;
        }
    }
}

public class DemoEncapsulation
{
    public static void main(String[] args)
    {
        BankAccount acc = new BankAccount("Alice", 1000);

        // acc.balance = -99999;  // ❌ Not allowed — balance is private.
        // Compiler error if uncommented.

        acc.deposit(500);       // ✅ Goes through validated method
        acc.withdraw(2000);     // ✅ Blocked — insufficient funds, handled safely
        acc.withdraw(300);      // ✅ Valid withdrawal

        System.out.println("Balance: " + acc.getBalance());
        System.out.println("Account Holder: " + acc.getAccountHolder());
    }
}