package org.example;

public class DemoDeadlock
{
    static final Object lockA = new Object();           //First Lock
    static final Object lockB = new Object();           //Second Lock

    public static void main(String[] args)
    {
        Thread t1 = new Thread(() -> {
            synchronized (lockA)            //Thread 1 acquires A
            {
                System.out.println("Thread 1: Holding A");

                synchronized (lockB)        //Tries to acquire B
                {
                    System.out.println("Thread 1: Holding B");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lockB)            //Thread 2 aquires B
            {
                System.out.println("Thread 2: Holding B");

                synchronized (lockA)            //Tries to acquire A
                {
                    System.out.println("Thread 2: Holding A");
                }
            }
        });

        t1.start();         //Starts thread 1
        t2.start();         //Starts thread 2
    }
}
