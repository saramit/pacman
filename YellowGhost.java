package pacman;

public class YellowGhost extends Ghost{
	Driver d;
	Pacman p;
	private int pacDist;
	
	public YellowGhost() {
		color = 'y';
		targetLocation = p.getLocation;
		startingRow = 14;
		startingCol = 20;
		// set pacDist to distance between pacman and ghost
	}
	
	
	public void navigateAwayFromTarget(World w, Location target) {
		//go the opposite way of the ghost if too close
		// works similarly to navigateMaze, but it chooses a location far away from the pacman
		
		// ArrayList<Location> list = new ArrayList<Location>()
		
		//goToTarget(w, list, targetLocation)
	}

	@Override
	public void doObjective() {
		// alternates from behaving like the red enemy when at some distance from Pac-Man and
		// aiming towards the lower-left corner of the maze whenever it gets too close to him

		p = d.getPacman();
		
		targetLocation = p.getLocation();
		
		
		if (pacDist >= 7) {
			super.navigateMaze(w, targetLocation);
		}
		else {
			this.navigateAwayFromTarget(w, targetLocation);
			if (this.getLocation ==  targetLocation) {
				this.doObjective(); 
			}
		}
		
	}
	
	

}
