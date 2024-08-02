package com.udemy.javamasterclass.section7;

public class Point {

  private int x;
  private int y;
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public Point() {
    super();
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int getX() {
    return x;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public void setX(int x) {
    this.x = x;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int getY() {
    return y;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public void setY(int y) {
    this.y = y;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  /**
   * Returns the distance from this point to Point(0, 0).
   * @return a double value with the distance from this point to Point(0, 0).
   */
  public double distance() {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  /**
   * Returns the distance from this point to the given Point.
   * @return a double value with the distance from this point to the given Point.
   */
  public double distance(Point p) {
    return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  /**
   * Returns the distance from this point to Point(x, y).
   * @param x an int value with the x-coordinate of the given Point.
   * @param y an int value with the y-coordinate of the given Point.
   * @return a double value with the distance from this point to Point(x, y).
   */
  public double distance(int x, int y) {
    return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}
