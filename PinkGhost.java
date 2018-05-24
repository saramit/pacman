package pacman;

public class PinkGhost extends Ghost {
	Pacman p;
	Driver d;
	World w;
	
	public PinkGhost() {
		color = 'p';
		targetLocation = p.getLocation;
		startingRow = 13;
		 startingCol = 19;
		// set pacDist to distance between pacman and ghost
	}
	
	@Override
	public void navigateMaze(World w, Location target) {
		
		//makes sure the location is reached in pacman's facial direction
		 
	}
	

	@Override
	public void doObjective() {
		// aims in front of pacman's mouth

		p = d.getPacman();
		
		targetLocation = p.getLocation();
		
		
		super.navigateMaze(w, targetLocation);
	
		
	}
	

}
