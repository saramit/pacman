package info.gridworld.actor;
import java.lang.Object;

public class RedGhost extends Ghost {
	Pacman p;
	Driver d;
	World w;
	
	public RedGhost() {
		color = 'r';
		targetLocation = p.getLocation;
		startingRow = 14;
		startingCol = 19;
		loc = new Location (startingRow, startingCol);
	}
	
	

	@Override
	public void doObjective() {
		// chases pacman

		w = d.getWorld();
		p = d.getPacman();
		
		targetLocation = p.getLocation();
		
		
		super.navigateMaze(w, targetLocation);
	
	
	}
	

}