package org.example;

public class DemoTemp
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: " + a + ", b = " + b);

        //Method 1: Using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Method 1: " + a + ", b = " + b);

        //Method 2: Without a temporary variable
        a = a + b; // a becomes 30 (10 + 20)
        b = a - b;// b becomes 10 (30 - 20)
        a = a - b;// a becomes 20 (30 - 10)

        System.out.println("After Method 2: " + a + ", b = " + b);

        //Method 3: Without a temporary variable
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Method 3: " + a + ", b = " + b);
    }
}
