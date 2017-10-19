package com.example.admin.encodingandjungleproblems;

/**
 * Created by Admin on 10/18/2017.
 */

public class Tiger extends Animal {

    private static int count;

    public Tiger() {
        super(15, "rawr", "Tiger", 5, 3, 5);
        count++;
    }

    public int getCount() {
        return count;
    }

    public String feed( Food food ) {
        if( food.getType() == Food.GRAIN )
            return "Tigers cannot eat grain.";
        else {
            addEnergy(5);
            return "Tiger ate " + food.getName() + ".";
        }
    }
}
