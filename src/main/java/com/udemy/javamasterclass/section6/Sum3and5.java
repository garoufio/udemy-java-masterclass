package com.udemy.javamasterclass.section6;

public class Sum3and5 {
  
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;
    
    for (int i = 1; count < 5 && i <= 1000; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        count++;
        sum += i;
        System.out.println("Found a match: " + i);
      }
    }
    System.out.println("Sum: " + sum);
  }
  
}
