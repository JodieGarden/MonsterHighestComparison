package com.codeclan.example.pokemontoptrumps;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 03/03/2017.
 */

public class TestDeck {
    Deck deck;
    Card cards;

    @Before
    public void before(){
        deck = new Deck();

    }

    @Test
    public void testNumberOfCards(){
        assertEquals(7, deck.getNumberOfCards());
    }

    @Test
    public void testRemoveCard(){
        Card card = deck.removeCard();
        assertNotNull(card);
        assertEquals(6, deck.getNumberOfCards());
    }

}
