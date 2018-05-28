package info.gridworld.actor;
import java.awt.image.BufferedImage;
import java.lang.Object;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class MovingThing {
	public enum Direction{NORTH,SOUTH,EAST,WEST};
	public Direction dir;
	public Location loc;
	
	public Location getLocation() {
		return loc;
	}
	
	public Direction getDirection() {
		return dir;
	}
	
	public void moveAndDraw(ActorWorld w) {
		Location nextLoc = getNextLoc();
		if (w.getGrid().get(nextLoc) instanceof Wall) {
			return;		// when Pacman hits a wall it stops moving but Ghosts don't; in the Ghost's maze-navigating
						// function, account for this so that it never hits a wall
		}
		
		loc=nextLoc;
		w.add(loc, getImage());
	}
	
	public Location getNextLoc() {
		// add walls around the perimeter so that adding/subtracting won't cause bounds error
		
		if (facingEast())
			return new Location(loc.getRow(),loc.getCol()+1);
		else if (facingWest())
			return new Location(loc.getRow(),loc.getCol()-1);
		else if (facingNorth())
			return new Location(loc.getRow()-1,loc.getCol());
		else
			return new Location(loc.getRow()+1,loc.getCol());
	}
	
	public void changeDirection(World w, Direction d) {		// fix this, Ghost doesn't need to redraw
		// for pacman, this would be called whenever an arrow key is pressed
		// for ghosts, this would be called in its maze-navigating method
		dir=d;
		w.add(loc, getImage());
		
	}
	
	public BufferedImage getImage() {
		return null;
	}
	
	public boolean facingEast() {
		return dir==Direction.EAST;
	}
	public boolean facingWest() {
		return dir==Direction.WEST;
	}
	public boolean facingNorth() {
		return dir==Direction.NORTH;
	}
	public boolean facingSouth() {
		return dir==Direction.SOUTH;
	}
	
	public boolean isWallInFront() {
		if (this.getNextLoc() != null) {
			return true;
		}
		return false;
	}

}