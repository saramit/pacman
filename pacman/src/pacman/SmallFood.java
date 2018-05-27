package info.gridworld.actor;

import java.awt.Color;
import java.awt.Graphics;

public class SmallFood extends Food {
	// worth 10 points and is consumed by pacman for points
	
	private SmallFood (){
		super();
		points = 10;
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(5, 5, c, r);
		
	}

}