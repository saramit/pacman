package pacman;

import pacman.Pacman.Direction;

public abstract class Ghost {
	public enum Direction{NORTH,SOUTH,EAST,WEST};
	private Direction dir;
	private int x;
	private int y;
	private int startingX;
	private int startingY;
	
	
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
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void eatenByPacman(){
		// ghost disappears and returns to startingX and startingY and wait momentarily before returning to the game
		
	}
	
	public abstract void doObjective();

}
