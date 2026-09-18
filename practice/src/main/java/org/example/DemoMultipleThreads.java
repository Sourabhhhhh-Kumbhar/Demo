package org.example;

//class A
//{
//    void show()
//    {
//        for(int i = 0; i <= 10; i++)
//        {
//            System.out.println("Yoooooooooo");
//        }
//    }
//}
//
//class B
//{
//    void show()
//    {
//        for(int i = 0; i <= 10; i++)
//        {
//            System.out.println("Broooooooooo");
//        }
//    }
//}
//public class DemoMultipleThreads
//{
//    public static void main(String[] args)
//    {
//        A obj1 = new A();
//        B obj2 = new B();
//
//        obj1.show();
//        obj2.show();
//    }
//}

//This code prints only one thread first after finishing the one thread it moves to another


//So we are going to write a code which prints threads concurrently

class A extends Thread
{
    public void run() //We use run() here so that we can use start() later
    {
        for (int i = 0; i <= 1000; i++) //Here we tried to increase the number of loops so that the compiler get less time to react and prints it parelelley
        {
            System.out.println("Heyyyyyy");
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 1000; i++)
        {
            System.out.println("Yooooooooo");
        }
    }
}

public class DemoMultipleThreads
{
    public static void main(String[]args)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); //We can only use start() when we have run() method in class
        obj2.start();

    }
}