package org.example;

//Now we gonna use sleep and priority so that we can print threads parellalay

class X extends Thread
{
    public void run() //We use run() here so that we can use start() later
    {
        for (int i = 0; i <= 1000; i++) //Here we tried to increase the number of loops so that the compiler get less time to react and prints it parelelley
        {
            System.out.println("Heyyyyyy");
        }
    }
}
class Y extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 100; i++)
        {
            System.out.println("Yooooooooo");

            try
            {
                Thread.sleep(10); //This will pause the execution for 10 milliseconds after execution of first thread
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}

public class DemoSleepPriority
{
    public static void main(String[]args)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj2.setPriority(Thread.MAX_PRIORITY); //This will push the Thread2 to execution

        obj1.start(); //We can only use start() when we have run() method in class
        obj2.start();

    }
}

//Basically here sleep will pause the execution for some milliseconds and the max priority will push the other thread for execution