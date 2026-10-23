package org.example;

public class DemoRecursion
{
    static int factorial(int n)
    {
        if(n == 0 || n == 1)    //Base case stops recursion
        {
            return 1;   //Factorial of 0 and 1 is  1
        }
        return n * factorial(n-1);  //Calls itself with a smaller number
    }
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
    }
}
