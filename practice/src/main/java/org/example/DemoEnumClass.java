package org.example;

public class DemoEnumClass
{
    enum Brand
    {
        SAMSUNG,
        APPLE,
        ONEPLUS
    }

    enum Color
    {
        BLUE,
        BROWN,
        GREEN
    }

    public static void main(String[] args)
    {
        DemoEnumClass.Brand b = DemoEnumClass.Brand.SAMSUNG;

        DemoEnumClass.Color color = DemoEnumClass.Color.BROWN;

        System.out.println(b);
        System.out.println(color);
    }
}


