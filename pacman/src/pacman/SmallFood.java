package pacman;

import java.awt.Color;
import java.awt.Graphics;

public class SmallFood extends Food {
	
	private SmallFood (int xVal, int yVal){
		super();
		x = xVal;
		y = yVal;
		points = 10;
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(5, 5, x, y);
		
	}

}
