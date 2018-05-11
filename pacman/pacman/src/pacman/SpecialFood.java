package pacman;

public SpecialFood extends Food{

  public SpecialFood(int x, int y){
    points = 10;
    isEaten = false;
    xCoord = x;
    yCoord = y;
  }
  
  public void draw (Graphics g){
    g.setColor(Color.yellow);
    g.drawOval(x,y,22,22);
  }
  
}
