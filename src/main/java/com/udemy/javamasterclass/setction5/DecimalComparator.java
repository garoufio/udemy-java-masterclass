package com.udemy.javamasterclass.setction5;

public class DecimalComparator {
  
  public static boolean areEqualByThreeDecimalPlaces (double value1, double value2) {
    long longValue1, longValue2;
    
    longValue1 = (long)(value1 * 1000);
    longValue2 = (long)(value2 * 1000);
    
    return longValue1 == longValue2;
  }
  
}
