package pacman;

import java.awt.Graphics;

public class Pacman {
	public enum Direction{North,South,East,West};
	private int lives;
	private Direction dir;
	private int score;
	private int x;
	private int y;
	
	public Pacman(){
		lives=3;
		score=0;
		dir=Direction.East;
		x=0;		// start in the lower left corner, facing right
		//y= height of board
		
	}
	
	public void eat(int foodValue) {	// in the food class, have a food.getValue() method that returns an int
		score+=foodValue;
	}
	
	public void move() {
		
	}
	
	public void draw(Graphics g) {
		
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
	
	
	

}
