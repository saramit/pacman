package pacman;

public class YellowGhost extends Ghost{
	Driver d;
	Pacman p;
	private int pacDist;
	
	public YellowGhost() {
		color = 'y';
		targetLocation = p.getLocation;
		// set pacDist to distance between pacman and ghost
	}
	
	
	public void navigateAwayFromTarget(World w, Location target) {
		//go the opposite way of the ghost if too close
	}

	@Override
	public void doObjective() {
		// TODO Auto-generated method stub

		p = d.getPacman();
		
		targetLocation = p.getLocation();
		
		
		if (pacDist >= 7) {
			super.navigateToTarget(w, targetLocation);
		}
		else {
			this.navigateAwayFromTarget(w, targetLocation);
		}
		
	}
	// alternates from behaving like the red enemy when at some distance from Pac-Man and
	// aiming towards the lower-left corner of the maze whenever it gets too close to him
	

}
