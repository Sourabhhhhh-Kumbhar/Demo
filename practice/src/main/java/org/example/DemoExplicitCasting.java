package org.example;

public class DemoExplicitCasting
{
    void show()
    {
        double number = 99.99;
        int result = (int)number;

        System.out.println("Double:" + number);
        System.out.println("Integer:" + result);

    }

    public static void main(String[] args)
    {
        DemoExplicitCasting obj = new DemoExplicitCasting();
        obj.show();

    }
}
