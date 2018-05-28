import info.gridworld.grid.Location;
import java.lang.Object;

public class Wall {
	private double row;
	private double col;
	private Location loc;
	
	public Wall(int r, int c) {
		row = r;
		col = c;
		loc = new Location (r,c);
	}
	
	

}