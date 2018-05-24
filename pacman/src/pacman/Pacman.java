package pacman;

import java.awt.Graphics;
import java.awt.Image;

public class Pacman extends MovingThing {
	private int lives;
	private int score;
	
	
	public Pacman(){
		lives=3;
		score=0;
		dir=Direction.EAST;
		loc = new Location(0,row);
		
	}
	
	@Override
	public Image getImage() {
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File(dir.toString().toLowerCase() + "pacman.png"));
		} catch (IOException e) {
		}
		return img;
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
	
	public int getLives() {
		return lives;
	}
	public int getScore() {
		return score;
	}
	
	
	
	

}
