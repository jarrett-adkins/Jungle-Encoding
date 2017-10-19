package com.example.admin.encodingandjungleproblems;

public class Animal {

    private int energy;
    private String sound, animalName;
    private int sleepEnergy, noiseEnergy, foodEnergy;

    public Animal() {

    }

    public Animal( int energy, String sound, String animalName, int sleepEnergy, int noiseEnergy, int foodEnergy ){
        this.energy = energy;
        this.sound = sound;
        this.animalName = animalName;
        this.sleepEnergy = sleepEnergy;
        this.noiseEnergy = noiseEnergy;
        this.foodEnergy = foodEnergy;
    }

    public String feed( Food f ) {
        energy += foodEnergy;
        return animalName + " ate " + f.getName() + ".";
    }

    public String sleep() {
        energy += sleepEnergy;
        return animalName + " went to sleep.";
    }

    public String makeSound() {
        if( getEnergy() > noiseEnergy ) {
            loseEnergy( noiseEnergy );
            return animalName + " goes '" + sound + "'.";
        } else
            return  animalName + " is too tired.";
    }

    public int getCount() {
        return 0;
    }

    public int getEnergy() {
        return energy;
    }

    public void addEnergy( int e ) {
        energy += e;
    }

    public void loseEnergy( int e ) {
        energy -= e;
    }

    public String play() {
        return animalName + " doesn't play.";
    }
}
