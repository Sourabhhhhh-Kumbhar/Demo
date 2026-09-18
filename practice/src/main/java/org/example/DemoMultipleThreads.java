package org.example;

class A
{
    void show()
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Yoooooooooo");
        }
    }
}

class B
{
    void show()
    {
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("Broooooooooo");
        }
    }
}
public class DemoMultipleThreads
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.show();
        obj2.show();
    }
}