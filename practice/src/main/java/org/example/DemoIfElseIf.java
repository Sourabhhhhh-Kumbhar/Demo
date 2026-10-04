package org.example;

public class DemoIfElseIf
{
    void check()
    {
        int result = 78;

        if (result > 90)
        {
            System.out.println("Grade A");
        }
        if(result > 80)
        {
            System.out.println("Grade B");
        }
        else if (result > 70)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Grade D");
        }
    }

    public static void main(String[] args)
    {
        DemoIfElseIf demo = new DemoIfElseIf();
        demo.check();
    }
}
