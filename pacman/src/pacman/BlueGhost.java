package pacman;

public class BlueGhost extends Ghost{
	
	public BlueGhost() {
		color = 'b';
	}
	
	public char getColor() {
		return color;
	}

	@Override
	public void doObjective() {
		// TODO Auto-generated method stub
		
	}
	// "fickle" -- sometimes heads towards pacman and sometimes away

}
