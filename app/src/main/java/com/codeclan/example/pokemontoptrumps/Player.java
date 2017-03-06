package com.codeclan.example.pokemontoptrumps;

/**
 * Created by user on 05/03/2017.
 */

public class Player {

    Card card;
    String name;
//    int chosenAttribute;

    public Player(String name){
        this.name = name;

    }


    public void takeCard(Card card){
        this.card = card;
    }

    public Card getCard(int strength){
        return this.card;
    }

//    public Player setChosenAttribute(int chosenAttribute) {
//        this.chosenAttribute = chosenAttribute;
//        return chosenAttribute;
//    }
}
