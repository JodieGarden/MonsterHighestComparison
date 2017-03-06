package com.codeclan.example.pokemontoptrumps;

import java.util.ArrayList;

/**
 * Created by user on 06/03/2017.
 */

public class Runner {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<Player>();
        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);
        Player player1 = new Player("Jodie");
        Player comp = new Player("Computer");
        players.add(player1);
        players.add(comp);
        Game game = new Game(players, dealer);

        game.play();


        String result = game.compareDefence();
        String result1 = game.compareEvolution();
        String result2 = game.compareStrength();
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }


}
