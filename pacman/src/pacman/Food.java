package pacman;

public abstract class Food {
	private abstract int points;
	private abstract int xCoord;
	private abstract int yCoord;
	private boolean isEaten;

	public void visible (Graphics g){
		if (isEaten == false){
			g.setVisible(true);
		}
		else{
			g.setVisible(false);
		}
	}
	
	public void ifEaten {
		isEaten = true;
		points = 0;
		visible(g);
	}
	
	
}
