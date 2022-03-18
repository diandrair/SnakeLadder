package com.nostraAcademy.NASnakeLadder;

import java.util.HashMap;
import java.util.Map;


public class Board {
	int cell;
	
	Map<Integer, Integer> snake = new HashMap<>();
    Map<Integer,Integer> ladder = new HashMap<>();

    public void addSnake(int head, int tail){
        snake.put(head,tail);
    }
    public void addLadder(int start, int end){
        ladder.put(start,end);
    }
    
    public Board() {
        this.cell = 100;
//        assuming winingPositon = 100; 
    }
    
    public void addoardEntity() {
    	addLadder(51,87);
    	addLadder(28,77);
    	addLadder(4, 42);
    	addLadder(30, 90);
    	addSnake(98, 36);
    	addSnake(66, 3);
    	addSnake(24, 8);
    	addSnake(86, 22);
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
