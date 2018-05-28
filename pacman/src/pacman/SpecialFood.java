
import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;

public class SpecialFood extends Food {
	// consumed by the pacman for no points, but the pacman is able to eat any ghosts it comes in contact with for 30 seconds
	Timer t;
	
	public SpecialFood (){
		super();
		points = 0;
		
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.YELLOW);
		g.drawRect(15, 15, c, r);
		
	}
	
	@Override
	public void ifEaten () {
		super.ifEaten();
		// makes the pacman able to consume ghosts
		
		 t = new Timer();
	}

}
