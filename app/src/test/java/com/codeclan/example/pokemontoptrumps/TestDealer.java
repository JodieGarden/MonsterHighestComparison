package com.codeclan.example.pokemontoptrumps;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 05/03/2017.
 */

public class TestDealer {

    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        dealer = new Dealer(deck);
    }

    @Test
    public void testCanDeal(){
        Card card = dealer.deal();
        assertNotNull(card);
        assertEquals(6, deck.getNumberOfCards());
    }
}
