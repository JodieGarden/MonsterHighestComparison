package com.codeclan.example.pokemontoptrumps;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 03/03/2017.
 */

public class Game {

    ArrayList<Player> players;
    Dealer dealer;
    Card card;

    public Game(ArrayList<Player> players, Dealer dealer){
        this.players = players;
        this.dealer = dealer;
    }

    public void play(){
        for (Player player: players){
            Card card = dealer.deal();
            player.takeCard(card);
        }
    }


    public String compareStrength(){
        int player1Hand = (players.get(0).card.getStrength());
        int player2Hand = (players.get(1).card.getStrength());

        if(player1Hand == player2Hand){
            return "It's a draw";
        }

        if(player1Hand > player2Hand){
            return"Player 1 wins";
        }
        else
            return "Player 2 wins";

    }

    public String 


}
