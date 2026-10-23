package org.example;

public class DemoMethodOverloading2
{
    static int add(int a, int b)
    {
        return a + b;   //Adds two integers
    }

    static int add(int a, int b, int c)
    {
        return a + b + c;   //Adds Three Integers
    }

    static double add(double a, double b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        System.out.println(add(5,5));   //Calls Two integers add method
        System.out.println(add(5,5,5)); //Calls three integers add method
        System.out.println(add(2.5, 4.5));  //Calls double method
    }
}
