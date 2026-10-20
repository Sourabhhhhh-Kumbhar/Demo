package org.example;

class ATMService
{
    //Method To Withdraw Money
    void withdraw(double balance, double amount)
    {
        //Throw an exception if the withdrawl amount is invalid
        if(amount <= 0)
        {
            throw new IllegalArgumentException("Amount must be greater than zero!!");
        }

        //Throw an exception if the balance is insufficient
        if(amount > balance)
        {
            throw new ArithmeticException("Insufficient balance!!");
        }

        //Display the remaining balance
        balance = balance - amount;
        System.out.println("Withdraw Successfull!!!");
        System.out.println("Remaining Balance: Rs. " + balance );
    }
}

public class DemoExceptionHandling2
{
    public static void main(String[]args)
    {
        //Create an Atm service object
        ATMService atm = new ATMService();

        try
        {
            //Attempt to withdraw money
            atm.withdraw(5000, 2000);
        }
        catch(IllegalArgumentException e)
        {
            //Handle invalid withdrawal amounts
            System.out.println("Error: " + e.getMessage());
        }
        catch(ArithmeticException e)
        {
            //Handle insufficient balance
            System.out.println("Error: " + e.getMessage());
        }
        finally
        {
            //This block executes whether the exception occurs or not
            System.out.println("Thank you for using the ATM!!");
        }
    }
}