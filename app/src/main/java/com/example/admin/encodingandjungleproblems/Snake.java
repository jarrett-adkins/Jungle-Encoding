package com.example.admin.encodingandjungleproblems;

/**
 * Created by Admin on 10/18/2017.
 */

public class Snake extends Animal {

    private static int count;

    public Snake() {
        super(2000, "hissss", "Snake", 10, 3, 5);
        count++;
    }

    public int getCount() {
        return count;
    }
}
