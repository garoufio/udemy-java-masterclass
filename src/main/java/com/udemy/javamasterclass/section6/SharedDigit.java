package com.udemy.javamasterclass.section6;

public class SharedDigit {
  
  public static boolean hasSharedDigit(int number1, int number2) {
    if (number1 < 10 || number1 > 99) return false;
    if (number2 < 10 || number2 > 99) return false;
    
    int digit;
    int buffer;
    boolean isShared = false;
    while (number1 != 0) {
      digit = number1 % 10;
      buffer = number2;
      while (buffer != 0) {
        if (digit == buffer % 10) {
          isShared = true;
          break;
        }
        buffer /= 10;
      }
      if (isShared) break;
      
      number1 /= 10;
    }
    return isShared;
  }
  
  public static void main(String[] args) {
    System.out.println(hasSharedDigit(123, 9876543));
  }

}
