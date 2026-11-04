package org.example;

class MyTask extends Thread         //Creates Custom Thread
{
    public void run()           //Code executed by thread
    {
        for(int i = 1; i < 5; i++)
        {
            System.out.println("Task: " + i);           //Prints task Progress
        }
    }
}

public class DemoMultithreading2
{
    public static void main(String[] args)
    {
        MyTask t1 = new MyTask();           //Creates A Thread Object

        t1.start();             //Starts a new thread

        System.out.println("Main thread started");          //Main Thread Continues
    }
}
