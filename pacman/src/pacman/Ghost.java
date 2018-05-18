package pacman;

import pacman.Pacman.Direction;

public abstract class Ghost {
	public enum Direction{NORTH,SOUTH,EAST,WEST};
	private Direction dir;
	private Location loc;
	private int startingX;
	private int startingY;
	char color;
	
	
	public Ghost() {
		dir = Direction.NORTH;
		// x and y will be initialized in specified classes because they all start 
		// in slightly different locations in the center of the board
		
		startingX = x;
		startingY = y;
		
	}
	
	public Direction getDirection() {
		return dir;
	}
	
	public void draw(World w) {
		
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
	
	public boolean east() {
		return dir == Direction.EAST;
	}
	public boolean west() {
		return dir == Direction.WEST;
	}
	public boolean north() {
		return dir == Direction.NORTH;
	}
	public boolean south() {
		return dir == Direction.SOUTH;
	}
	public Location getLocation() {
		return loc;
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
