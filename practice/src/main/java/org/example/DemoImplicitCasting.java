package org.example;

public class DemoImplicitCasting
{
    void show()
    {
        int number = 50;
        double result = number;

        System.out.println("Integer: " + number);
        System.out.println("Double: " + result);
    }

    public static void main(String[]args)
    {
        DemoImplicitCasting obj = new DemoImplicitCasting();
        obj.show();
    }
}
