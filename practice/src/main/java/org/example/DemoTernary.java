package org.example;

public class DemoTernary
{
    void check()
    {
        int a = 10;
        int b = 20;

        String result = (a > b) ? "a is greater than b" : "b is greater than a";

        System.out.println("Result: " + result);
    }

    public static void main(String[] args)
    {
        DemoTernary obj = new DemoTernary();
        obj.check();
    }
}
