package pacman;

public class Driver {
	Pacman p;
	World w;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		
		d.start();

	}
	
	public void start () {
		p = new Pacman();
		
		
	}
	
	public Pacman getPacman() {
		return p;
	}
	
	public World getWorld() {
		return w;
	}

}
