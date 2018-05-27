package info.gridworld.actor;

import java.awt.Color;
import java.awt.Graphics;

public class LargeFood extends Food {
	// worth 50 points and is consumed by pacman for points
	
	private LargeFood (){
		super();
		points = 50;
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(10, 10, c, r);
		
	}

}
