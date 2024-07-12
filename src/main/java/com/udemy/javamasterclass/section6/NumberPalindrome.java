package com.udemy.javamasterclass.section6;

public class NumberPalindrome {
  
  public static boolean isPalindrome(int number) {
    if (number < 0) number = Math.abs(number);
    
    int originalNumber = number;
    int reverse = 0;
    int lastDigit;
    while (originalNumber != 0) {
      lastDigit = originalNumber % 10;
      reverse = (reverse * 10) + lastDigit;
      originalNumber /= 10;
    }
    
    return (number == reverse);
  }
  
}
