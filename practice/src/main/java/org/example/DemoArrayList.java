package org.example;

import java.util.ArrayList;

public class DemoArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<String>();       //Creates An Empty List

        fruits.add("Apple");        //Adds Apple to the list
        fruits.add("Banana");       //Adds Banana to the list
        fruits.add("Orange");       //Adds Orange to the list

        System.out.println(fruits);     //Prints All fruits

        fruits.remove("Banana");        //Removes Banana from list

        System.out.println(fruits.get(1));      //Prints the element at index 1
        System.out.println(fruits.size());      //Prints the number of elements

        for(String fruit : fruits)      //Iterates Through every fruits
        {
            System.out.println(fruit);      //Prints the current fruit
        }

        System.out.println(fruits);
    }
}
