package com.codeclan.example.pokemontoptrumps;

/**
 * Created by user on 03/03/2017.
 */

public class Card {
    String name;
    int strength;
    int defence;
    int evolutions;

    public Card(String name, int strength, int defence, int evolutions) {
        this.name = name;
        this.strength = strength;
        this.defence = defence;
        this.evolutions = evolutions;
    }

    public String getName() {
        return this.name;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getDefence(){
        return this.strength;
    }

    public int getEvolutions(){
        return this.evolutions;
    }


}
