package com.nostraAcademy.NASnakeLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Game {
	 public Board board;
	    List<Player> players = new ArrayList<>();
	    
	    int numberOfPlayers;
	    Scanner sc = new Scanner(System.in);
	    
	    public void addPlayer() {
	    	 System.out.print("Enter number of players : ");
	         int numberOfPlayers = sc.nextInt();
	         
	         System.out.println("What are the names of the " + numberOfPlayers + " players?");
	         for(int loop = 1; loop <= numberOfPlayers; loop++) {
	             Player player = new Player();
	             
	             System.out.print("Enter name for player " + loop + ": ");
	             player.setName(sc.next());
	             
	             players.add(player);
	         }
	         sc.close();
	     }
}
