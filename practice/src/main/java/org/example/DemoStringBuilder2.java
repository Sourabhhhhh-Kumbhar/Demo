package org.example;

public class DemoStringBuilder2
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Javaaa");     //Creates a mutable character sequence

        sb.append("Rocks");         //Adds text to the end
        sb.insert(4, "Programming");        //Inserts text at index 4
        sb.replace(0, 4, "Python");     //Replaces characters from index 0 to 3
        sb.delete(6, 18);           //Deletes characters from index 6 to 17
        sb.reverse();           //Reverses the character sequence

        System.out.println(sb);         //Prints the final modified sequence
    }
}
