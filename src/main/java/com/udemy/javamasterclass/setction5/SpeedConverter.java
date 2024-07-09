package com.udemy.javamasterclass.setction5;

public class SpeedConverter {
  
  public static long toMilesPerHour(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      return -1L;
    }
    else {
      return Math.round(kilometersPerHour / 1.609);
    }
  }
  
  public static void printConversion(double kilometersPerHour) {
    long milesPerHour = toMilesPerHour(kilometersPerHour);
    
    if (milesPerHour < 0L) {
      System.out.println("Invalid Value");
    }
    else {
      System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
  }
  
}