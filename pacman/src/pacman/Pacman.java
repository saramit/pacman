package pacman;

import java.awt.Graphics;
import java.awt.Image;

public class Pacman {
	public enum Direction{NORTH,SOUTH,EAST,WEST};
	private int lives;
	private Direction dir;
	private int score;
	private int x;
	private int y;
	
	private static final String fileName="images/pacman";
	
	public Pacman(){
		lives=3;
		score=0;
		dir=Direction.EAST;
		x=0;	// start in the lower left corner, facing right
		//y= height of board
		
	}
	
	public void changeScore(int value) {
		score+=value;
	}
	
	public void addLives(int num) {
		lives+=num;
	}
	
	public void subtractLives(int num) {
		addLives(-num);
	}
	
	public void moveAndDraw(Graphics g) {
		// check to make sure it's not facing a wall
		// add walls on the edges of the board so we don't need to do a bounds check
		if (facingEast())
			x+=3;
		else if (facingWest())
			x-=3;
		else if (facingNorth())
			y-=3;
		else
			y+=3;
		
		String s=fileName + dir.toString() + ".png";	// example: images/pacmanNorth.png
		Image img = null;
		g.drawImage(img, x, y, null);
	}
	
	public void changeDirection(Graphics g, Direction d) {	// this would be called whenever an arrow key is pressed
		dir=d;
		String s=fileName + dir.toString() + ".png";
		Image img = null;
		g.drawImage(img, x, y, null);
	}
	
	
	public Direction getDirection() {
		return dir;
	}
	public int getLives() {
		return lives;
	}
	public int getScore() {
		return score;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	
	public boolean facingEast() {
		return dir==Direction.EAST;
	}
	public boolean facingWest() {
		return dir==Direction.WEST;
	}
	public boolean facingNorth() {
		return dir==Direction.NORTH;
	}
	public boolean facingSouth() {
		return dir==Direction.SOUTH;
	}
	
	

}
