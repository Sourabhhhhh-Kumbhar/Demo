package org.example;

import java.util.Scanner;

public class DemoScanner
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int result = dividend/divisor;

        System.out.println("Result: " + result);
    }
}