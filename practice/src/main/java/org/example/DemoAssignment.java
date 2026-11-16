package org.example;

public class DemoAssignment
{
    void assign() {
        int a = 10;

        System.out.println("Initial value: " + a);

        a += 5;
        System.out.println("After += 5: " + a);

        a -= 10;
        System.out.println("After -= 10: " + a);

        a *= 5;
        System.out.println("After *= 5: " + a);

        a /= 2;
        System.out.println("After /= 2: " + a);

        a %= 4;
        System.out.println("After %= 4: " + a);
    }

    public static void main(String[] args)
    {
        DemoAssignment demo = new DemoAssignment();
        demo.assign();
    }

}
