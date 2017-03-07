package com.codeclan.example.pokemontoptrumps;

import java.util.ArrayList;
import java.util.Collections;

import static android.R.attr.name;

/**
 * Created by user on 03/03/2017.
 */

public class Deck {

    ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<Card>();
        populateCards();
    }


    public void populateCards(){
        cards.add(new Card("Blastoise", 10, 11, 11));
        cards.add(new Card("Charizard", 10, 12, 12));
        cards.add(new Card("Mimikyu", 10, 12, 12));
        cards.add(new Card("Gyarados", 10, 23, 3));
        cards.add(new Card("Chikorita", 12, 3, 4));
        cards.add(new Card("Mew", 12, 2, 3));
        cards.add(new Card("Bulbasaur", 2, 12, 3));

    }

    public int getNumberOfCards(){
        return cards.size();
    }

    public Card removeCard(){
        Card card = cards.remove(0);
        return card;
    }

    public void shuffle(){
        Collections.shuffle(cards);
    }
}
