package com.codeclan.example.pokemontoptrumps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by user on 06/03/2017.
 */

public class Runner {

    public static void main(String[] args) {
        Player player1 = new Player("Jodie");
        Player comp = new Player("Computer");
        Deck deck = new Deck();
        ArrayList<Player> players = new ArrayList<Player>();
        Dealer dealer = new Dealer(deck);
        String compPlay;

        Card card1 = new Card("Blastoise", 10, 11, 11);
        Card card2 =new Card("Charizard", 10, 12, 12);
        Card card3 =new Card("Mimikyu", 10, 12, 12);
        Card card4 =new Card("Gyarados", 10, 23, 3);
        Card card5 =new Card("Chikorita", 12, 3, 4);
        Card card6 =new Card("Mew", 12, 2, 3);
        Card card7 =new Card("Bulbasaur", 2, 12, 3);

        deck.populateCards();
        Game game = new Game(players,dealer);
        ArrayList<Card> cards;


        Scanner scan = new Scanner(System.in);
        Random generator = new Random();


        System.out.println("Lets Battle!\n");
        game.play();
        System.out.println("Players card is " + card2.getName() + "." + "Defence: " + card2.getDefence() + "Evolutions: " + card2.getEvolutions() + "Strength:" + card2.getStrength() );
//        System.out.println(player.card.getName() + player1.card.getEvolutions() + player1.card.getStrength() +player1.card.getDefence());

//        String result = game.compareDefence();
        String result1 = game.compareEvolution();
        String result2 = game.compareStrength();
//        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

//        comp = generator.nextInt(3) + 1;
//
//
//        if (comp == 1) {
//            compPlay = "Strength";
//            if (comp == 2)
//                compPlay = "Evolutions";
//            if (comp == 3)
//                compPlay = "Defence";
//
//
//        }
//
    }
}








