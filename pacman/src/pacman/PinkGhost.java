package info.gridworld.actor;

import java.lang.Object;

public class PinkGhost extends Ghost {
	Pacman p;
	Driver d;
	World w;
	
	public PinkGhost() {
		color = 'p';
		targetLocation = p.getLocation;
		startingRow = 13;
		startingCol = 19;
		loc = new Location (startingRow, startingCol);
	}
	
	@Override
	public void navigateMaze(World w, Location target) {
		
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