package info.gridworld.actor;

import java.lang.Object;

import javax.imageio.ImageIO;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Pacman extends MovingThing {
	private int lives;
	private int score;
	private int row;
	private int col;
	private int startingRow;
	private int startingCol;
	
	
	public Pacman(){
		lives=3;
		score=0;
		dir=Direction.EAST;
		loc = new Location(startingCol,startingRow);
		fileName=dir.toString().toLowerCase() + "pacman.png";
		
	}
	
	@Override
	public BufferedImage getImage() {
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