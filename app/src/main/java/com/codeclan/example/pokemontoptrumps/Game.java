package com.codeclan.example.pokemontoptrumps;

import java.util.ArrayList;

import static android.R.attr.cacheColorHint;
import static android.R.attr.canRequestEnhancedWebAccessibility;
import static android.R.attr.name;
import static android.media.CamcorderProfile.get;

/**
 * Created by user on 03/03/2017.
 */

public class Game {

    ArrayList<Player> players;
    ArrayList<Card> cards;
    Dealer dealer;
    Player player1;
    Player comp;
    Card card;
    int result1;
    int result2;




    public Game(ArrayList<Player> players, Dealer dealer){

        this.players = players;
        this.dealer = dealer;

    }


    public int playerArrayLength(){
        return players.size();
    }

    public void play(){
        for (Player player : players){
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
            return players.get(0).name + " wins";
        }
        else
            return players.get(1).name + " wins";

    }

    public String compareDefence() {
        int player1Hand = (players.get(0).card.getDefence());
        int player2Hand = (players.get(1).card.getDefence());

        if(player1Hand == player2Hand){
            return "It's a draw";
        }
        if(player1Hand == player2Hand){
            return players.get(0).name + " wins";
        }
        else
            return players.get(1).name + " wins";
    }

    public String compareEvolution(){
        int player1Hand = (players.get(0).card.getEvolutions());
        int player2Hand = (players.get(1).card.getEvolutions());

        if (player1Hand == player2Hand){
            return "It's a draw";
        }
        if (player1Hand > player2Hand){
            return players.get(0).name + " wins";
        }
        else
            return players.get(1).name + " wins";
    }


}
