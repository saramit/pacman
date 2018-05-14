package pacman;

import java.awt.Graphics;

public abstract class Food {
	public int points;
	protected int x;
	protected int y;
	private boolean isEaten;
	
	public Food (){
		isEaten = false;
		//visible(g);
	}
	
	public int getPoints(){
		return points;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}

	public void visible (Graphics g){
		if (isEaten == false){
			//g.draw(g);
		}
		else{	
			//g.setVisible(false);
		}
	}
	
	public void ifEaten () {
		isEaten = true;
		points = 0;
		//visible(g);
	}

	public abstract void draw (Graphics g);


	
	
}