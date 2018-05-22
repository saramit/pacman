package pacman;

public class BlueGhost extends Ghost{
	Driver d;
	Pacman p;
	World w;
	private int pacDist;
	
	public BlueGhost() {
		color = 'b';
		targetLocation = p.getLocation;
		// set pacDist to distance between pacman and ghost
	}

	

	@Override
	public void doObjective() {
		// TODO Auto-generated method stub
		
		
		World w = d.getWorld();

		p = d.getPacman();
		int chance = (int) (Math.random()*2);
		
		if (chance == 1) {
			targetLocation = p.getLocation();
		}
		else {
			//targetLocation = bottom left corner;
		}
		
		
		super.navigateToTarget(w, targetLocation);
		

	}
	// "fickle" -- sometimes heads towards pacman and sometimes away

}
