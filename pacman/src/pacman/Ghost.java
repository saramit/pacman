package pacman;

import pacman.Pacman.Direction;

public abstract class Ghost extends MovingThing {
	private int startingX;
	private int startingY;
	char color;
	private final Image img;

	public Ghost() {
		dir = Direction.NORTH;
		// x and y will be initialized in specified classes because they all start 
		// in slightly different locations in the center of the board
		// startingX = x;
		// startingY = y;

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(getFileName));
		} catch (IOException e) {
		}

	}

	@Override
	public Image getImage() {
		return img;
	}

	public String getFileName() {
		String c="";
		if (color=='p')
			c="pink";
		else if (color=='b')
			c="blue";
		else if (color=='r')
			c="red";
		else
			c="yellow";
		return c+"ghost.png";
	}

	/*
	public void goToTarget(World w, ArrayList<Location> list, Location target) {
		Location nextLoc;
		while (list.size()>0) {
			nextLoc = getNextLoc();
			if (list.get(0).compareTo(nextLoc)==0)
					moveAndDraw(w);
			else {
				changeDirection(w, loc.getDirectionToward(target));		// getDirectionToward() returns an int
				moveAndDraw(w);
			}
			list.remove(0);
		}
		
	}
	*/
	
	@Override
	public void changeDirection(World w, Direction d) {
		dir=d;
	}
	
	public void eatenByPacman(){							// incomplete
		
		// ghost disappears and returns to startingX and startingY and wait momentarily before returning to the game
		if (color == 'p') {
			// construct a new ghost that starts at the starting point
		} else if (color == 'b') {

		} else if (color == 'r') {

		} else if (color == 'y') {

		}
	}

	public char getColor() {
		return color;
	}
	
	public void navigateMaze(World w, Location target) {		// incomplete
		// ArrayList<Location> list = new ArrayList<Location>();
		
		/*
		 * solve the maze and create a list describing the path it needs to take
		 * use grid.get or g.getNeighbors or g.getOccupiedAdjacentLocations with instanceof Wall
		 * 
		 * figure out direction of pacman relative to ghost (eg. west and south)
		 * 		public int getDirectionToward(loc)
		 * then just pick a direction (eg. west) and keep going until you hit a wall
		 * whenever you hit a wall, change to the other direction (eg. south) and repeat
		 * this would not work in some cases (eg. getting trapped by a wall shaped like an L
		 * 
		 * if it gets trapped: (how would it know?)
		 * 		backtrack until 
		 */
		
		// goToTarget(w,list, target);
	}

	public abstract void doObjective();


}
