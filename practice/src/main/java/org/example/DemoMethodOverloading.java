package org.example;

public class DemoMethodOverloading
{
    //Method with two integer parameters
    static int add(int a, int b)
    {
        return a + b;
    }

    //Same method name but three parameters
    static int add(int a, int b, int c)
    {
        return a + b + c;
    }

    //Different method name but same parameters
    static int subtract(int a, int b)
    {
        return a - b;
    }

    //Same method name but different parameter types
    static double add(double a, double b)
        {
        return a + b;
        }

    public static void main(String[]args)
    {
        //Calls the method with 2 integer parameters
        System.out.println("Sum of two integers: " + add(10 , 20));

        System.out.println("Sum of thee integers: " + add(10 , 20 , 30));

        System.out.println("Subtraction of two integers: " + subtract(40 , 10));

        System.out.println("Sum of two doubles: " + add(2000,1200));
    }

}
