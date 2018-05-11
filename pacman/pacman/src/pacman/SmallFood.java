package pacman;

public SmallFood extends Food{

  public SmallFood(int x, int y){
    points = 10;
    isEaten = false;
    xCoord = x;
    yCoord = y;
  }
  
  public void draw (Graphics g){
    g.setColor(Color.white);
    g.drawOval(x,y,10,10);
  }
  
}
