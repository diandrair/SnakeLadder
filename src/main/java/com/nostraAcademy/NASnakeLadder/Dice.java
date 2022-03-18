package com.nostraAcademy.NASnakeLadder;

import java.util.Random;

public class Dice {
	
	public int rollDice() {
        Random r = new Random();        
        return r.nextInt(6) + 1;
    }

}
