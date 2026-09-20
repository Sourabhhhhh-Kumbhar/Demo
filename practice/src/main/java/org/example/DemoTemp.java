package org.example;

public class DemoTemp
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Method 1: " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;
    }
}
