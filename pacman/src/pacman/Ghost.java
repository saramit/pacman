package info.gridworld.actor;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.tools.DocumentationTool.Location;


public abstract class Ghost extends MovingThing {
	public int startingCol;
	public int startingRow;
	public int col;	
	public int row;
	char color;
	private final Image img;
	private ArrayList<Location> list;	

	public Ghost() {
		dir = Direction.NORTH;
		// x and y will be initialized in specified classes because they all start 
		// in slightly different locations in the center of the board
		col = startingCol;

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(getFileName));
		} catch (IOException e) {
		}

	}

	@Override
	public BufferedImage getImage() {
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
				changeDirection(w, loc.getDirectionToward(target));		// getDirectionToward() returns heading in degrees
				moveAndDraw(w);
			}
			list.remove(0);
		}
		
	}
	*/
	
	public Direction degreesToDir(int deg) {
		if (deg==0)
			return Direction.NORTH;
		else if (deg==90)
			return Direction.EAST;
		else if (deg==180)
			return Direction.SOUTH;
		else if (deg==270)
			return Direction.WEST;
	}
	
	@Override
	public void changeDirection(World w, Direction d) {
		dir=d;
	}
	
	public void eatenByPacman(){							
		if (color == 'p') {
			this = null;	
			this = new PinkGhost();	
	 	} else if (color == 'b') {
			this = null;	+
			this = new BlueGhost();	
 		} else if (color == 'r') {
			this = null;	+
			this = new RedGhost();	
 		} else if (color == 'y') {
			this = null;	+
			this = new YellowGhost();
 		}

	public char getColor() {
		return color;
	}
	
	public void matchRow(World w, Location target) {		// incomplete
		if (loc.equals(target)) return;
		if (loc.getRow()-target.getRow()>0)
			Direction d = Direction.NORTH;
		else
			Direction d = Direction.SOUTH;
		changeDirection(w,d);
		Location prevLoc;
		while (loc.getRow()!=target.getRow()) {
			prevLoc=loc;
			moveAndDraw(w);
			if (prevLoc.equals(loc)) {
				Direction originalDir = dir;
				while (w.getGrid().get(getNextloc()) instanceof Wall) {
					// change direction (which way?)
					moveAndDraw(w);
					changeDirection(originalDir);
				}
			}
		}
	}
	public void matchCol(World w, Location target) {		// incomplete
		if (loc.equals(target)) return;
		if (loc.getCol()-target.getCol()>0)
			Direction d = Direction.WEST;
		else
			Direction d = Direction.EAST;
		changeDirection(w,d);
		Location prevLoc;
		while (loc.getCol()!=target.getCol()) {
			prevLoc=loc;
			moveAndDraw(w);
			if (prevLoc.equals(loc)) {
				// do stuff
			}
		}
	}
	
	public void navigateMaze(World w, Location target) {
		while (!loc.equals(target)) {
			matchRow(w, target);
			matchCol(w, target);
		}
		
		
		// ArrayList<Location> list = new ArrayList<Location>();
		// goToTarget(w,list, target);
		
		/*
				int degrees = loc.getDirectionToward(target);
				Direction d1, d2;
				if (int%90 ==0)
					d1=degreesToDir(degrees);
				else {
					d1=degreesToDir(degrees-45);
					if (degrees+45 == 360)
						d2=degreesToDir(0);
					else
						d2=degreesToDir(degrees+45);
				}
				Location prevLoc;
				while (!loc.equals(target)) {
					prevLoc=loc;
					moveAndDraw(w);
					if (prevLoc.equals(loc)) {	// only works if it's bounded by a wall on one side only
						if (getDirection()==d1)
							changeDirection(w,d2);
						else
							changeDirection(w,d1);
					}
				}
				*/
		
	}

	public abstract void doObjective();


}
