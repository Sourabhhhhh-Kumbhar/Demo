package org.example;

public class DemoTryCatchFinally
{
    public static void main(String[] args)
    {
        try
        {
            int number = 100;
            int result = number / 0;

            System.out.println(result);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide a number by zero!");
        }
        finally
        {
            System.out.println("This block always executes");
        }

        System.out.println("Programs continues...");
    }
}
