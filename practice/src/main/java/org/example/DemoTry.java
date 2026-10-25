package org.example;

public class DemoTry
{
    public static void main(String[] args)
    {
        int a = 10;     //Stores the numerator
        int b = 20;     //Stores zero as the denominator

        try
        {
            int result = a / b;     //Throws ArithmeticException
            System.out.println(result);     //Runs only if division succeeds
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");        //Handles the exception
        }
        finally
        {
            System.out.println("Execution Completed!!!");       //Always RUns whether the condition remains true or false
        }

        System.out.println("Program Continues");        //Executes after the program execution
    }

}
