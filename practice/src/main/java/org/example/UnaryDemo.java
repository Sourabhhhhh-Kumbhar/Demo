package org.example;

public class UnaryDemo
{
    public static void main(String[] args)
    {
        int a = 5;

        // 1. Unary plus / minus
        System.out.println(+a);   // 5
        System.out.println(-a);   // -5

        // 2. Increment (++)
        int b = 10;
        System.out.println(b++);  // 10 (pehle use, phir increment) -> b = 11
        System.out.println(++b);  // 12 (pehle increment, phir use)

        // 3. Decrement (--)
        int c = 10;
        System.out.println(c--);  // 10 -> c = 9
        System.out.println(--c);  // 8

        // 4. Logical NOT (!)
        boolean flag = true;
        System.out.println(!flag); // false

        // 5. Bitwise NOT (~)
        int d = 5;
        System.out.println(~d);   // -6  (formula: -(n+1))
    }
}
