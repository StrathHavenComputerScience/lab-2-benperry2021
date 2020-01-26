public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    
    //Robot is in front of dark squares
    cleanRow();
    cleanRow();
    cleanRow();
    cleanRow();
  }
  
  public static void cleanSpot()
  {
      //Robot is in front of a dark square
      Robot.move();
      Robot.makeLight();
      //Robot is on a lightened square
  }
  
  public static void cleanRow()
  {
      //Robot is facing towards dark squares
      cleanSpot();
      cleanSpot();
      cleanSpot();
      cleanSpot();
      cleanSpot();
      Robot.move();
      Robot.turnLeft(); 
      //Robot is ready for next row
    
  }
  
  public static void turnRight()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.turnLeft();
  }
  
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    //Robot is looking up from the base of the comb
    rowReady();
    rowReady();
    rowReady();
    rowReady();
    darkenRow();
    //Robot has darkened all spots
  }
  
  public static void darkenSpot()
  {
    Robot.move();
    Robot.makeDark();
  }
  
  public static void darkenRow()
  {
    //Robot is at start of a new row
    turnRight();
    Robot.makeDark();
    darkenSpot();
    darkenSpot();
    darkenSpot();
    darkenSpot();
    darkenSpot();
    darkenSpot();
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    Robot.move();
    turnRight();
    //Robot is at the start of the row, looking up
  }
  
  public static void rowReady()
  {
    //Robot is at the start of a row
    darkenRow();
    nextRow();
  }
  
  public static void nextRow()
  {
    //Robot is ready for a new row
    Robot.move();
    Robot.makeDark();
    Robot.move();
    //Robot is at the next row
  }
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
    //Robot has blank checkerboard
    twoRows();
    newRowSet();
    twoRows();
    newRowSet();
    twoRows();
    newRowSet();
    twoRows();
  }
  
  public static void checkerRow()
  {
    Robot.makeDark();
    Robot.move();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    Robot.move();
    Robot.makeDark();
    Robot.move();
    
  }
  
  public static void twoRows()
  {
    checkerRow();
    turnRight();
    Robot.move();
    turnRight();
    checkerRow();
  }
  
  public static void newRowSet()
  {
    Robot.turnLeft(); 
    Robot.move();
    Robot.turnLeft();
    
  }
}
