package pacman;

import java.awt.Graphics;
import java.awt.Image;

public class Pacman {
	public enum Direction{NORTH,SOUTH,EAST,WEST};
	private int lives;
	private Direction dir;
	private int score;
	private Location loc;
	
	
	public Pacman(){
		lives=3;
		score=0;
		dir=Direction.EAST;
		loc = new Location(0,row);
		
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
	
	public void moveAndDraw(World w) {
		// check to make sure it's not facing a wall
		// add walls on the edges of the board so we don't need to do a bounds check
		if (facingEast())
			loc = new Location(loc.getRow(),loc.getCol()+1);
		else if (facingWest())
			loc = new Location(loc.getRow(),loc.getCol()-1);
		else if (facingNorth())
			loc = new Location(loc.getRow()-1,loc.getCol());
		else
			loc = new Location(loc.getRow()+1,loc.getCol());
		
		w.add(loc, getImage());
	}
	
	public void changeDirection(World w, Direction d) {	// this would be called whenever an arrow key is pressed
		dir=d;
		// g.drawImage(getImage(), x, y, null);
		w.add(loc, getImage());
		
	}
	
	public Image getImage() {
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File(dir.toString().toLowerCase() + "pacman.png"));
		} catch (IOException e) {
		}
		return img;
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
	public Location getLocation() {
		return loc;
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
