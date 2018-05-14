package pacman;

import java.awt.Color;
import java.awt.Graphics;

public class SpecialFood extends Food {
	
	private SpecialFood (int xVal, int yVal){
		super();
		x = xVal;
		y = yVal;
		points = 0;
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawRect(15, 15, x, y);
		
	}
	
	@Override
	public void ifEaten () {
		super.ifEaten();
		// makes the pacman able to consume ghosts
	}

}
