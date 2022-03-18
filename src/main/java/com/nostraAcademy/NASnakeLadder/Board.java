package com.nostraAcademy.NASnakeLadder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Board {
	Scanner scInt = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);
	int num;
	int cell;
	
	Map<Integer, Integer> snake = new HashMap<>();
    Map<Integer,Integer> ladder = new HashMap<>();

    public void addSnake() {
    	System.out.print("Enter Snake position hi(spasi)low : ");
    	String numStr = scStr.nextLine();
    	String [] strArr = numStr.split(" ");
    	
        snake.put(Integer.valueOf(strArr[0]), Integer.valueOf(strArr[1]));
    }
    public void addLadder(){
    	System.out.print("Enter Ladder position low(spasi)hi : ");
    	String numStr = scStr.nextLine();
    	String [] strArr = numStr.split(" ");
    	
        ladder.put(Integer.valueOf(strArr[0]), Integer.valueOf(strArr[1]));
    }
    
    public Board() {
        this.cell = 100;
//        assuming winingPositon = 100; 
    }
    
    public void addBoardEntity() {
    	
    	System.out.print("Enter number of Snake : ");
    	int numSnake = scInt.nextInt();
    	
    	for(int loop = 1; loop <= numSnake; loop++) {
    	addSnake();
    	
    	}
    	
    	System.out.print("Enter number of Ladder : ");
    	int numLad = scInt.nextInt();
    	
    	for(int loop = 1; loop <= numLad; loop++) {
    	addLadder();
    	
    	}
    
    }
    
    public void moveThrough( Player player, int diceRoll){
        if(player.position + diceRoll > cell){
            return;
        }
        player.position += diceRoll;
        if (snake.get(player.position) != null ){
            System.out.println(player.name+ " Bit By snake!!!");
            player.position = snake.get(player.position);
            System.out.println("move to: "+ player.position);
        }
        if (ladder.get(player.position) != null ){
            System.out.println(player.name+" Got ladder!!!");
            player.position = ladder.get(player.position);
            System.out.println("move to: "+ player.position);
        }
    }

}
