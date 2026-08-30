package org.example;

public class DemoArray
{
    int[] numbers = {20,1,3,4,3,2,1,4,5,67};

    void display()
    {
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        DemoArray obj = new DemoArray();

        obj.display();
    }
}
