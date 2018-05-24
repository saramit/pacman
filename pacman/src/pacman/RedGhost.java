package pacman;

public class RedGhost extends Ghost {
	Pacman p;
	Driver d;
	World w;
	
	public RedGhost() {
		color = 'r';
		targetLocation = p.getLocation;
		 startingRow = 14;
		 startingCol = 19;
		// set pacDist to distance between pacman and ghost
	}
	
	

	@Override
	public void doObjective() {
		// chases pacman

		p = d.getPacman();
		
		targetLocation = p.getLocation();
		
		
		super.navigateMaze(w, targetLocation);
	
	
	}
	

}
