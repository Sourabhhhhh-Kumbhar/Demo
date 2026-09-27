package org.example;

public class DemoFor
{
    void loop()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Number: " + i);
        }
        System.out.println("Loop Completed!!!!");
    }
    public static void main(String[] args)
    {
        DemoFor demo = new DemoFor();
        demo.loop();
    }
}
