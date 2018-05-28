import java.lang.Object;
import info.gridworld.actor.*;
import info.gridworld.grid.*;

public class YellowGhost extends Ghost{
	Driver d;
	Pacman p;
	
	public YellowGhost() {
		color = 'y';
		targetLocation = p.getLocation;
		startingRow = 14;
		startingCol = 20;
		loc = new Location (startingRow, startingCol);
	}
	
	public Location getLocation() {
		return loc;
	}
	
	
	public void navigateAwayFromTarget(World w, Location target) {
		// go the opposite way of the ghost if too close
		// works similarly to navigateMaze, but it chooses a location far away from the pacman
		// on the other side of the board
		
		/*ArrayList<Location> list = new ArrayList<Location>();
		 * 
		 * 
		 *
		 * goToTarget(w, list, targetLocation);
		 */
	}

	@Override
	public void doObjective() {
		// alternates from behaving like the red enemy when at some distance from Pac-Man and
		// aiming towards the lower-left corner of the maze whenever it gets too close to him
		
		w = d.getWorld();
		p = d.getPacman();
		
		targetLocation = p.getLocation();
		
		if (list.size() >= 5) {
			super.navigateMaze(w, targetLocation);
		}
		else {
			this.navigateAwayFromTarget(w, targetLocation);
			if (this.getLocation == targetLocation) {
				this.doObjective();
			}
		}
		
	}
	
		
}