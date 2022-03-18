package com.nostraAcademy.NASnakeLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Game {
 	
	public Board board;
 	Dice dice = new Dice();
 	
    List<Player> players = new ArrayList<>();
    List<Player> winnerList = new ArrayList<>();
    int numberOfPlayers;
    
    Scanner sc = new Scanner(System.in);
    
    public Game(Board board) {
		super();
		this.board = board;
		
	}
    
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

	
	public void launch() {
        int currentTurn = 0;
        while (winnerList.size() < players.size()-1) {
        	 

            if (currentTurn >= players.size()) {

                currentTurn = 0;
            } else {
                currentTurn += 1;

            }
            Player currPlayer = players.get(currentTurn);
            if (currPlayer.position == 100) {
                continue;
            }
            int rollValue = dice.rollDice();
            board.moveThrough(currPlayer, rollValue);
            if (currPlayer.position == board.cell) {
                winnerList.add(currPlayer);
                System.out.println(currPlayer.name + " won!!");
            }
            for (Player player : players) {
                System.out.println(player.name + " current Position " + player.position);
            }
        }
        
	}
	
}
