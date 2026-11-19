package org.example;

public class DemoRelational
{
    void compare()
    {
        int a = 20;
        int b = 10;

        System.out.println("a == b : " + (a == b));     //Is Equal to

        System.out.println("a != b : " + (a != b));     //Is Not Equal to

        System.out.println("a > b : " + (a > b));       //Is Greater than

        System.out.println("a >= b : " + (a < b));      //Is Less than

        System.out.println("a >= b : " + (a >= b));     //Is Greater than equal to

        System.out.println("a <= b : " + (a <= b));     //Is Less than equal to


    }

    public static void main(String[] args)
    {
        DemoRelational demo = new DemoRelational();

        demo.compare();
    }
}
