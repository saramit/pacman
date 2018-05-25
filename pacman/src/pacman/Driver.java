package pacman;
import java.lang.Object
import java.util.Timer;

public class Driver {
	Pacman p;
	World w;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		
		d.start();
		w.setGrid(new UnboundedGrid());
		
		
	}
	
	public void start () {
		w = new World();
		p = new Pacman();
		Ghost bg = new BlueGhost();
		Ghost rg = new RedGhost();
		Ghost pg = new PinkGhost();
		Ghost yg = new YellowGhost();
		
		w.add(p.getLoc, p);
		w.add(bg.getLocation, bg);
		w.add(rg.getLocation, rg);
		w.add(pg.getLocation, pg);
		w.add(yg.getLocation, yg);
		while (int i = 0; i < 4) {
			w.add(new LargeFood);
			i++
		}
		w.add(new SpecialFood);
		
		addWalls();
		addSmallFood();
		
	}
	
	public void addWalls() {
		
	}
	
	public void addSmallFood() {
		
		for (Location l : getRandomEmptyLocation()) {
			w.add(new SmallFood);
		}
		
	}
	
	public Pacman getPacman() {
		return p;
	}
	
	public World getWorld() {
		return w;
	}

}
