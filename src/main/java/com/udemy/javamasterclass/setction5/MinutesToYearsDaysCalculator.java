package com.udemy.javamasterclass.setction5;

public class MinutesToYearsDaysCalculator {
  
  public static final long MINUTES_PER_DAY = 24 * 60;
  public static final long MINUTES_PER_YEAR = 365 * MINUTES_PER_DAY;
  
  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
      return;
    }
    
    long years, days;
    years = minutes / MINUTES_PER_YEAR;
    days = (minutes % MINUTES_PER_YEAR) / MINUTES_PER_DAY;
    System.out.printf("%d min = %d y and %d d\n", minutes, years, days);
  }
  
}
