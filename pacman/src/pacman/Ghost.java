package pacman;

import pacman.Pacman.Direction;

public abstract class Ghost extends MovingThing {
	private int startingX;
	private int startingY;
	char color;
	
	
	public Ghost() {
		dir = Direction.NORTH;
		// x and y will be initialized in specified classes because they all start 
		// in slightly different locations in the center of the board
		
		startingX = x;
		startingY = y;
		fileName=getFileName();
		
	}
	
	public String getFileName() {
		String c="";
		if (color=='p')
			c="pink";
		else if (color=='b')
			c="blue";
		else if (color=='r')
			c="red";
		else
			c="yellow";
		return c+"ghost.png";
	}
	
	public void eatenByPacman(){
		// ghost disappears and returns to startingX and startingY and wait momentarily before returning to the game
		
		if (color == 'p') {
			// construct a new ghost that starts at the starting point
		}
		else if (color == 'b') {
			
		}
		else if (color == 'r') {
			
		}
		else if (color == 'y') {
		
		}
	}
	
	public char getColor() {
		return color;
	}
	
	public abstract void doObjective();

}
