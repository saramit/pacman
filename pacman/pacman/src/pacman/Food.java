package pacman;

public abstract class Food {
  private abstract int points;
  private abstract int xCoord;
  private abstract int yCoord;
  private boolean isEaten;

  public void visible (boolean isEaten, Graphics g){
    if (isEaten == false){
      g.setVisible(true);
    }
    
  }
  
  
}
