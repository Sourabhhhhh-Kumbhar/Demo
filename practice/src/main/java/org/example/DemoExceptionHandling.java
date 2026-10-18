package org.example;

public class DemoExceptionHandling
{
    //Divide two numbers, throwing an error if the divisor is zero
    public static int divide(int a, int b)
    {
        return a / b;
    }

    public static void main(String[] args)
    {
        try
        {
            //This line will throw an ArithmeticException
            int result = divide(10, 0);

            System.out.println("Result is: " + result);
        }
        catch(ArithmeticException e)
        {
            //Run only if the exception happens
            System.out.println("Error: Cannot divide by zero");
        }

        finally
        {
            //Always runs, whether or not an exception occurred
            System.out.println("Done!!!");
        }
    }
}
