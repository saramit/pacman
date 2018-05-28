

public abstract class Food {
	public int points;
	protected int c;
	protected int r;
	private boolean isEaten;
	
	public Food (){
		isEaten = false;
		//visible(g);
	}
	
	public int getPoints(){
		return points;
	}
	public int getCol(){
		return c;
	}
	public int getRow(){
		return r;
	}

	public void visible (){
		if (isEaten == false){
			
		}
		else{	
			
		}
	}
	
	public void ifEaten () {
		isEaten = true;
		points = 0;
		visible();
	}

	
	
}