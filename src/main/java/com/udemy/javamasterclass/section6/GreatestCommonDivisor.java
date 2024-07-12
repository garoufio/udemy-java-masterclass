package com.udemy.javamasterclass.section6;

public class GreatestCommonDivisor {
  
  public static int getGreatestCommonDivisor(int first, int second) {
    if (first < 10 || second < 10) return -1;
    
    int gcd = -1;
    int min, max;
    
    if (first <= second) {
      min = first;
      max = second;
    }
    else {
      min = second;
      max = first;
    }
    
    
    for (int i = min; i> 0; i--) {
      if (min % i == 0) {
        if (max % i == 0) gcd = i;
      }
      if (gcd != -1) break;
    }
    
    return gcd;
  }

}
