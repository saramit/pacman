package pacman;

public class PinkGhost extends Ghost {
	Pacman p;
	Driver d;
	World w;
	
	public PinkGhost() {
		color = 'p';
		targetLocation = p.getLocation
	}
	
	@Override
	public void navigateToTarget(World w, Location target) {
		
		//makes sure the location is reached in pacman's facial direction
		 
	}
	

	@Override
	public void doObjective() {
		// TODO Auto-generated method stub

		p = d.getPacman();
		
		targetLocation = p.getLocation();
		
		
		super.navigateToTarget(w, targetLocation);
	
		
	}
	// aims in front of pacman's mouth

}
