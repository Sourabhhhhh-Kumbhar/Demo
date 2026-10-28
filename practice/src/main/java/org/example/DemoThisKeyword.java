package org.example;

class Player
{
    String name;        //Stores the player's name
    int level;          //Stores the player's level

    Player(String name, int level)
    {
        this.name = name;       //Assigns the parameter to the object's name
        this.level = level;     //Assigns the parameter to the object's level
    }

    void display()
    {
        System.out.println(this.name + " - Level " + this.level);        //Displays the current object's data
    }
}

public class DemoThisKeyword
{
    public static void main(String[] args)
    {
        Player p1 = new Player("Shadow " , 10);       //Creates the first player
        Player p2 = new Player("Blaze " , 25);       //Creates the second player

        p1.display();       //Displays Shadow's details
        p2.display();       //Displays Blaze's details
    }
}
