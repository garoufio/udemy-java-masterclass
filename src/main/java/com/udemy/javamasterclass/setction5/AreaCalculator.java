package com.udemy.javamasterclass.setction5;

public class AreaCalculator {
  
  public static double area(double radius) {
    if (radius < 0) {
      return -1L;
    }
    
    return Math.PI * radius * radius;
  }
  
  public static double area(double x, double y) {
    if (x < 0 || y < 0) {
      return -1L;
    }
    
    return x * y;
  }
  
}
