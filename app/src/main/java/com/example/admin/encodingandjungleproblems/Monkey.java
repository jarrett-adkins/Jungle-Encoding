package com.example.admin.encodingandjungleproblems;

/**
 * Created by Admin on 10/18/2017.
 */

public class Monkey extends Animal {

    private static int count;

    public Monkey() {
        super(5, "Oooo", "Monkey", 10, 4, 2);
        count++;
    }

    public int getCount() {
        return count;
    }

    public String play() {
        String result = "";

        if( getEnergy() >= 8 ) {
            loseEnergy(8);
            return "Monkey plays and goes \"Oooo Oooo Oooo";
        } else
            return "Monkey is too tired.";
    }
}
