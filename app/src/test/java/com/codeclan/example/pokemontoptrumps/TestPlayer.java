package com.codeclan.example.pokemontoptrumps;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by user on 05/03/2017.
 */

public class TestPlayer {

    Player player;
    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
        player = new Player("Jodie");
        dealer = new Dealer(deck);
    }

    @Test
    public void testGetCard(){
        Card card = dealer.deal();
        player.takeCard(card);
        assertNotNull(player.getCard(card.getStrength()));
    }


}
