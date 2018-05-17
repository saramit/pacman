package pacman;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;

public class SpecialFood extends Food {
	// consumed by the pacman for no points, but the pacman is able to eat any ghosts it comes in contact with for 30 seconds
	Timer t;
	
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
		
		 t = new Timer(1000, new ActionListener() {
			 @Override
             public void actionPerformed(ActionEvent e) {
                 lives.removeLife();
                 
		 }
		
		//while (t > 30 seconds) {
		// 	it lets you eat the pacman
		//}
		
	}

}
