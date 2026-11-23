package org.example;

public class DemoThrowsKeyword {
    static void divide(int a, int b) throws ArithmeticException {
        int result = a / b;

        System.out.println("Result : " + result);
    }

    public void main(String[] args)
    {
        try
        {
            divide(10, 5);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot Divide by zero");
        }
    }
}
