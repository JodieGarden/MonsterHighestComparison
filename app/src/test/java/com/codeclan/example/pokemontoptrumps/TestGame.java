package com.codeclan.example.pokemontoptrumps;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 06/03/2017.
 */

public class TestGame {

    ArrayList<Player> players;
    Deck deck;
    Dealer dealer;
    Player player1;
    Player comp;
    Game game;

    @Before
    public void before(){
        players = new ArrayList<Player>();
        player1 = new Player("Jodie");
        comp = new Player("Comp");
        players.add(player1);
        players.add(comp);
        game = new Game(players, dealer);
    }

    @Test
    public void testCompareStrength(){
        player1.takeCard(new Card("Blastoise", 89, 83,1));
        comp.takeCard(new Card("Charizard", 90, 80, 2));
        assertEquals("Player 2 wins", game.compareStrength());
    }

    @Test
    public void testCompareDefence(){
        player1.takeCard(new Card("Blastoise", 89, 83,1));
        comp.takeCard(new Card("Charizard", 90, 80, 2));
        assertEquals("Player 1 wins", game.compareDefence());
    }

    @Test
    public void testCompareEvolutions(){
        player1.takeCard(new Card("Blastoise", 89, 83,1));
        comp.takeCard(new Card("Charizard", 90, 80, 1));
        assertEquals("It's a draw", game.compareEvolution());
    }

}
