package org.example;

class MyTaskk implements Runnable           //Defines a runnable task
{
    public void run()           //Contains the task's work
    {
        System.out.println("Thread is Working");        //Prints Message
    }
}

public class DemoRunnable
{
    public static void main(String[] args)
    {
        MyTaskk task = new MyTaskk();             //Creates the Task

        Thread t1 = new Thread(task);           //Assigns task to a thread

        t1.start();             //Starts the thread
    }
}
