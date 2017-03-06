package com.codeclan.example.pokemontoptrumps;

/**
 * Created by user on 03/03/2017.
 */

public class Dealer {

    Deck deck;

    Dealer(Deck deck){
        this.deck = deck;
        this.deck.shuffle();
    }

    public Card deal(){
        Card card = deck.removeCard();
        return card;
    }
}
