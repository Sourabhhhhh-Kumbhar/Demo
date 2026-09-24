package org.example;

class Example
{
    private int data;
    private final Object lock = new Object(); // dedicated lock object for the critical section

    // Added a parameter "value" — this was missing, causing a compile error
    public void updateData(int value)
    {
        System.out.println("Doing non-critical work...."); // runs without any lock — no shared data touched here

        synchronized (lock)
        {
            data = value;   // critical section: only one thread can modify "data" at a time
        }

        System.out.println("Done.."); // also runs without a lock
    }

    private static int staticCounter;

    // Renamed to reflect what it actually does (increments AND returns).
    // Locks on Example.class since it's static — shared across all instances.
    public static synchronized int incrementAndGetStaticCounter()
    {
        staticCounter++;
        return staticCounter;   // was missing — method promised to return int but didn't
    }

    // If you just want to READ the value without changing it, keep that separate:
    public static synchronized int getStaticCounter()
    {
        return staticCounter;  // pure getter — no side effects
    }
}

public class WayTwoDemoSynchronized
{
    public static void main(String[] args)
    {
        Example e = new Example();
        e.updateData(42);   // prints the two messages, sets data = 42 inside the lock

        Example.incrementAndGetStaticCounter();
        Example.incrementAndGetStaticCounter();

        System.out.println("Static counter: " + Example.getStaticCounter()); // prints 2
    }
}