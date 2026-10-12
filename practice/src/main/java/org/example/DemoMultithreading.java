package org.example;

class MyThread extends Thread
{
    private String task;

    MyThread(String task)
    {
        this.task = task;
    }

    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println(task + " : " + i);

            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread interrupted");
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class DemoMultithreading
{
    public static void main(String[] args)
    {
        MyThread t1 = new MyThread("Thread A");
        MyThread t2 = new MyThread("Thread B");

        t1.start();
        t2.start();
    }
}
