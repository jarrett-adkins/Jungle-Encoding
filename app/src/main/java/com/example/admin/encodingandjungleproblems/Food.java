package com.example.admin.encodingandjungleproblems;

/**
 * Created by Admin on 10/18/2017.
 */

public class Food {

    public static final int MEAT = 0;
    public static final int FISH = 1;
    public static final int BUGS = 2;
    public static final int GRAIN = 3;

    private int type;
    private String name;

    public Food( int type ) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public String getName() {
        switch( type ) {
            case MEAT:
                return  "meat";
            case FISH:
                return "fish";
            case BUGS:
                return  "bugs";
            case GRAIN:
                return "grain";
        }

        return "meat";
    }
}
