package pacman;

import java.awt.Color;
import java.awt.Graphics;

public class LargeFood extends Food {
	// worth 50 points and is consumed by pacman for points
	
	private LargeFood (int xVal, int yVal){
		super();
		x = xVal;
		y = yVal;
		points = 50;
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(10, 10, x, y);
		
	}

}
