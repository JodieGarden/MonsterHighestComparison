package com.codeclan.example.pokemontoptrumps;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/03/2017.
 */

public class TestCard {
    Card card;


    @Before
    public void before() {
        card = new Card("Blastoise", 79, 100, 4);
//     Name, hp from bulpabedia, defence and evolutions.
    }

    @Test
    public void testGetName(){
        assertEquals("Blastoise", card.getName());
    }

    @Test
    public void testGetStrength(){
        assertEquals(79, card.getStrength());
    }

    @Test
    public void testGetDefence(){
        assertEquals(100, card.getDefence());
    }

    @Test
    public void testGetEvolutions() {
        assertEquals(4, card.getEvolutions());
    }
}
