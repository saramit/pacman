package pacman;
import java.util.Timer;
import java.lang.Object;

public class BlueGhost extends Ghost{
	Driver d;
	Pacman p;
	World w;
	
	public BlueGhost() {
		color = 'b';
		targetLocation = p.getLocation;
		startingRow = 15;
		startingCol = 19;
		loc = new Location (startingRow, startingCol);
	}

	@Override
	public void doObjective() {
		// "fickle" -- sometimes heads towards pacman and sometimes away
		
		Timer time = new Timer();
		// runs by a timer where it chooses whether to go away or towards pacman every few minutes
		
		
		w = d.getWorld();
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
