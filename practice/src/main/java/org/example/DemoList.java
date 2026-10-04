package org.example;

import java.util.ArrayList;
import java.util.List;

public class DemoList
{
    public static List<String> createList()
    {
        List<String> names = new ArrayList<>();

        names.add("Anikaa");
        names.add("Nishaa");
        names.add("Sourabh");

        return names;
    }

    public static void displayList(List<String> names)
    {
        System.out.println("List: " + names);
    }

    public static void main(String[] args)
    {
        List<String> names = createList();

        displayList(names);

    }
}
