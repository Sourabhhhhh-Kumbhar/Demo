package org.example;

class FinalKeyword
{
    final int number = 100;

    final void display()
    {
        System.out.println("Final Variable: " + number);
    }
}

public class DemoFinalKeyword
{
    public static void main(String[] args)
    {
        FinalKeyword obj = new FinalKeyword();

        obj.display();
    }
}