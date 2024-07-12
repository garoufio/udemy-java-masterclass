package com.udemy.javamasterclass.section6;

public class LargestPrime {
  
  public static int getLargestPrime(int number) {
    if (number <= 1) return -1;
    
    int largestPrime = number;
    boolean isPrime;
    for (int i = number - 1; i > 1; i--) {
      if (number % i == 0) {
        isPrime = true;
        for (int j = i - 1; j > 1; j--) {
          if (i % j == 0) {
            isPrime = false;
            break;
          }
        }
        if (isPrime) {
          largestPrime = i;
          break;
        }
      }
    }
    
    return largestPrime;
  }

}
