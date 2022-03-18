package com.nostraAcademy.NASnakeLadder;


/**
 * Let's play!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	Board board = new Board();
    	Game game = new Game(board);
    	game.board.addBoardEntity();
    	game.addPlayer();
    	game.launch();
    	
    	
    }
}
