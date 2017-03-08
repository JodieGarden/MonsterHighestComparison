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
        cards.add(new Card("Mega Blastoise", 90, 79, 4));
        cards.add(new Card("Charizard", 68, 60, 3));
        cards.add(new Card("Mimikyu", 55, 50, 1));
        cards.add(new Card("Gyarados", 95, 75, 2));
        cards.add(new Card("Chikorita", 48, 65, 1));
        cards.add(new Card("Mew", 100, 40, 1));
        cards.add(new Card("Pelliper", 60, 100, 2));
        cards.add(new Card("Bulbasaur", 49, 49, 1));
        cards.add(new Card("Lickitung", 90, 75, 2));
        cards.add(new Card("Decidueye", 78, 75, 3));
        cards.add(new Card("Exeggcute", 60, 80, 1));
        cards.add(new Card("Kabuto", 30, 90, 1));
        cards.add(new Card("Rapidash", 65, 70, 1));
        cards.add(new Card("Rayquaza", 105, 90, 1));
        cards.add(new Card("Snorlax", 160, 65, 2));
        cards.add(new Card("Typhlosion", 78, 78, 3));
        cards.add(new Card("Arcanine", 90, 80, 2));
        cards.add(new Card("Cubone", 50, 95, 1));
        cards.add(new Card("Espeon", 65, 60, 2));
        cards.add(new Card("Golduck", 80, 72, 2));


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
