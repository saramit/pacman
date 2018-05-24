package pacman;
import java.util.Timer;

public class BlueGhost extends Ghost{
	Driver d;
	Pacman p;
	World w;
	private int pacDist;
	
	public BlueGhost() {
		color = 'b';
		targetLocation = p.getLocation;
		startingRow = 15;
		startingCol = 19;
		// set pacDist to distance between pacman and ghost
	}

	

	@Override
	public void doObjective() {
		// "fickle" -- sometimes heads towards pacman and sometimes away
		
		Timer time = new Timer();
		// runs by a timer where it chooses whether to go away or towards pacman every few minutes
		
		
		World w = d.getWorld();

		p = d.getPacman();
		int chance = (int) (Math.random()*2);
		
		if (chance == 1) {
			targetLocation = p.getLocation();
		}
		else {
			//targetLocation = bottom left corner;
		}
		
		super.navigateMaze(w, targetLocation);
		

	}
	

}
