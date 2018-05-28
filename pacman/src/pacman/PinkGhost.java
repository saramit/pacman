import java.lang.Object;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class PinkGhost extends Ghost {
	Pacman p;
	Driver d;
	ActorWorld w;
	
	public PinkGhost() {
		color = 'p';
		targetLocation = p.getLocation;
		startingRow = 13;
		startingCol = 19;
		loc = new Location (startingRow, startingCol);
	}
	
	public Location getLocation() {
		return loc;
	}
	
	@Override
	public void navigateMaze(ActorWorld w, Location target) {
		
		//makes sure the location is reached in pacman's facial direction
		// other then that it will work like the super class
		 
	}

	@Override
	public void doObjective() {
		// aims in front of pacman's mouth
		
		w = d.getWorld();
		p = d.getPacman();
		targetLocation = p.getLocation();
		
		super.navigateMaze(w, targetLocation);
	
		
	}
	

}