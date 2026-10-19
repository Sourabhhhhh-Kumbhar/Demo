package org.example;

class Account
{
    //Common Method Inherited by child classes
    void display()
    {
        System.out.println("This is Bank Account");
    }

    //Method that child classes can Override
    void interest()
    {
        System.out.println("General Account Interest");
    }
}

//Child class inherits Account
class SavingsAccount extends Account
{
    //Overriding the parent class method
    @Override
    void interest()
    {
        System.out.println("Saving Account Interest Is 5%");
    }
}

//Child Class Inherits Account
class CurrentAccount extends Account
{
    //Overriding The Parent class Method
    @Override
    void interest()
    {
        System.out.println("Current Account has No Interest");
    }
}

//Main Class
public class DemoInPoly
{
    public static void main(String[] args)
    {
        //Inheritance: child object uses the parent class method
        SavingsAccount s = new SavingsAccount();

        //Polymorphism: parent reference refers to a child object
        Account a;

        a = new SavingsAccount();
        a.interest();

        a = new CurrentAccount();
        a.interest();
    }
}