
public class MovingThing {
	public enum Direction{NORTH,SOUTH,EAST,WEST};
	private Direction dir;
	private Location loc;
	private String fileName;
	
	public Location getLocation() {
		return loc;
	}
	
	public Direction getDirection() {
		return dir;
	}
	
	public Image getImage() {
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File(fileName));
		} catch (IOException e) {
		}
		return img;
	}
	
	public void moveAndDraw(World w) {
		// check to make sure it's not facing a wall
		// add walls on the edges of the board so we don't need to do a bounds check
		if (facingEast())
			loc = new Location(loc.getRow(),loc.getCol()+1);
		else if (facingWest())
			loc = new Location(loc.getRow(),loc.getCol()-1);
		else if (facingNorth())
			loc = new Location(loc.getRow()-1,loc.getCol());
		else
			loc = new Location(loc.getRow()+1,loc.getCol());
		
		w.add(loc, getImage());
	}
	
	public void changeDirection(World w, Direction d) {
		// for pacman, this would be called whenever an arrow key is pressed
		// for ghosts, this is called in its maze-navigating method
		dir=d;
		w.add(loc, getImage());
		
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

}
