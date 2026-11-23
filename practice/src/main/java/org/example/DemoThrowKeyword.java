package org.example;

public class DemoThrowKeyword
{
    static void checkAge(int age)
    {
        try
        {
            if(age < 18)
            {
                throw new IllegalArgumentException("Age must be greater than 18");
            }

            System.out.println("You are Eligible.");
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args)
    {
        checkAge(15);
    }
}
