package pacman;

public class RedGhost extends Ghost {
	Pacman p;
	Driver d;
	World w;
	
	public RedGhost() {
		color = 'r';
		targetLocation = p.getLocation
	}
	
	

	@Override
	public void doObjective() {
		// TODO Auto-generated method stub

		p = d.getPacman();
		
		targetLocation = p.getLocation();
		
		
		super.navigateToTarget(w, targetLocation);
	
	
	}
	// chases pacman

}
