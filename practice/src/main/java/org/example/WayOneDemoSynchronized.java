package org.example;

class Counter
{
    private int count;

    // SYNCHRONIZED METHOD
    // The lock here is "this" (the Counter object itself).
    // Only one thread can be inside ANY synchronized method
    // of this specific object at a time.
    // If Thread A is inside increment(), Thread B must WAIT
    // until Thread A finishes, even if B calls increment() too.
    public synchronized void increment()
    {
        count++;   // now safe: read-modify-write can't be interrupted
    }

    public synchronized int getCount()
    {
        return count;
    }
}

public class WayOneDemoSynchronized
{
    public static void main(String[] args) throws InterruptedException
    {
        Counter c = new Counter();

        Runnable task = () ->
        {
            for (int i = 1; i <= 1000; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        // Wait for both threads to finish before reading the result
        t1.join();
        t2.join();

        // Guaranteed to be exactly 2000 now — no lost updates
        System.out.println("Final count: " + c.getCount());
    }
}