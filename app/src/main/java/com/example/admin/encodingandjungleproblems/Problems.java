package com.example.admin.encodingandjungleproblems;

/**
 * Created by Admin on 10/18/2017.
 */

public class Problems {

    public static String f (String s) {
        char[] chars = s.toCharArray();
        String result = "";

        for( int i = 0; i < chars.length; i++ ) {
            if(chars[i] > 64 && chars[i] < 91) {
                int start = (int) 'A';
                int end = (int) 'Z';
                int distance = chars[i] - start;
                int encodedChar = end - distance;
                result += (char) encodedChar;
            } else if (chars[i] > 96 && chars[i] < 123) {
                int start = (int) 'a';
                int end = (int) 'z';
                int distance = chars[i] - start;
                int encodedChar = end - distance;
                result += (char) encodedChar;
            } else
                result += chars[i];
        }

        return result;
    }

    public static void g (String g) {
        char[] alphabet = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t',
                'u','v','w','x','y','z'};

        char[] input = g.toLowerCase().toCharArray();
        String[] output = new String [26];

        for( int i = 0; i < alphabet.length; i++ ) {
            int count = 0;

            for( int j = 0; j < input.length; j++ ) {
                if( alphabet[i] == input[j])
                    count++;
            }

            output[i] = alphabet[i] + ":" + count;
        }

        for(String s: output)
            System.out.println( s );
    }

    public static String soundOff( Animal[] animals ) {
        String result = "";

        for (Animal a : animals)
            result += a.makeSound() + " Energy Level: " + a.getEnergy() + ".\n";

        return result;
    }

    public static String feed( Animal[] animals, Food food ) {
        String result = "";

        for (Animal a : animals)
            result += a.feed( food ) + " Energy Level: " + a.getEnergy() + ".\n";

        return result;
    }

    public static String sleep( Animal[] animals ) {
        String result = "";

        for (Animal a : animals)
            result += a.sleep() + " Energy Level: " + a.getEnergy() + ".\n";

        return result;
    }

    public static String play( Animal[] animals ) {
        String result = "";

        for (Animal a : animals)
            result += a.play() + " Energy Level: " + a.getEnergy() + ".\n";

        return result;
    }

    public static void main(String[] args) {
        System.out.println( "==============================================");
        System.out.println( "Encoding Problem");
        System.out.println( "==============================================");
        System.out.println();
        System.out.println( f( "acp" ) );
        System.out.println( f( "Errors in strategy cannot be correct through tactical maneuvers." ) );
        g( "Hello there! Apple!" );
        System.out.println();
        System.out.println( "==============================================");
        System.out.println( "Jungle Problem");
        System.out.println( "==============================================");
        System.out.println();
        Animal[] animals = {new Tiger(),
                            new Monkey(),
                            new Snake()};
        System.out.println( soundOff( animals ) );
        System.out.println( soundOff( animals ) );
        System.out.println( soundOff( animals ) );
        System.out.println( feed( animals, new Food(0) ) );
        System.out.println( feed( animals, new Food(3) ) );
        System.out.println( sleep( animals ) );
        System.out.println( play( animals ) );
    }
}
