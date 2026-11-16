package org.example;

public class DemoBitwise
{
    void bitwise()
    {
        int a = 5;
        int b = 3;

        System.out.println("a & b = " + (a & b));

        System.out.println("a | b = " + (a | b));

        System.out.println("a ^ b = " + (a ^ b));

        System.out.println("~a = " + (~a));

        System.out.println("a >> 1 = " + (a >> 1));

        System.out.println("a << 2 = " + (a << 2));
    }

    public static  void main(String[] args)
    {
        DemoBitwise demo = new DemoBitwise();

        demo.bitwise();
    }
}
