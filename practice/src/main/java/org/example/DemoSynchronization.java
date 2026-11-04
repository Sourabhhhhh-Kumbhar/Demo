package org.example;

class Counterr
{
    int count = 0; // Shared variable

    void increment()
    {
        count++; // Reads, increases, and writes the value
    }
}

public class DemoSynchronization
{
    public static void main(String[] args) throws InterruptedException
    {
        Counterr c = new Counterr(); // Shared counter

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) c.increment();
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) c.increment();
        });

        t1.start(); // Starts first thread
        t2.start(); // Starts second thread

        t1.join(); // Waits for first thread
        t2.join(); // Waits for second thread

        System.out.println(c.count); // Prints final count
    }
}
