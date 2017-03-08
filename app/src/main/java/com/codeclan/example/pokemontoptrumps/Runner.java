package com.codeclan.example.pokemontoptrumps;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * Created by user on 06/03/2017.
 */

public class Runner {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String attr;
        String result = new String();
        String result2;
        String result3;


        ArrayList<Player>players = new ArrayList<Player>();
        Deck deck = new Deck();
        Dealer dealer = new Dealer(deck);
        Player p1 = new Player("You");
        Player computer = new Player("Misty");
        players.add(p1);
        players.add(computer);

        Game game = new Game (players, dealer);


        System.out.println("Welcome to Pokemon");
        System.out.println();
        game.play();


        System.out.println(players.get(0).card.getName()+"! I choose you!");
        System.out.println(players.get(0).card.getStrength() +"strength");
        System.out.println(players.get(0).card.getDefence() +"defence");
        System.out.println(players.get(0).card.getEvolutions() +"evolutions");

        System.out.println("Please select an attribute");

        sc = new Scanner(System.in);
        attr = sc.nextLine();
        System.out.flush();



//        System.out.println(players.get(1).card.getStrength() +"strength");
//        System.out.println(players.get(1).card.getDefence() +"defence");
//        System.out.println(players.get(1).card.getEvolutions() +"evolutions");

        if(attr.contentEquals("strength")){
            System.out.println(game.compareStrength());
            System.out.println(players.get(1).card.getName() + " was the computers card.");
            System.out.println(players.get(1).card.getStrength() + " strength");
        }
        else if (attr.contentEquals("defence")){
            System.out.println(game.compareDefence());
            System.out.println(players.get(1).card.getName() + " was the computers card.");
            System.out.println(players.get(1).card.getDefence() + " defence");
        }
        else if(attr.contentEquals("evolutions")){
            System.out.println(game.compareEvolution());
            System.out.println(players.get(1).card.getName() + " was the computers card.");
            System.out.println(players.get(1).card.getEvolutions() +" evolutions");

        }

//

    }
}








