package com.udemy.javamasterclass.section6;

public class NumberToWords {
  
  public static int getDigitCount(int number) {
    if (number < 0) return -1;
    
    int count = 1;
    while (number >= 10) {
      number /= 10;
      count++;
    }
    
    return count;
  }
  
  //----------------------------------------------------------------------------------------------------------------
  
  public static int reverse(int number) {
    int originalNumber = number;
    int reverse = 0;
    int lastDigit;
    do {
      lastDigit = originalNumber % 10;
      reverse = (reverse * 10) + lastDigit;
      originalNumber /= 10;
    } while (originalNumber != 0);
    
    return reverse;
  }
  
  public static void numberToWords(int number) {
    if (number < 0) {
      System.out.println("Invalid Value");
      return;
    }
    
    int reversedNumber = reverse(number);
    int reversedNumberDigits = getDigitCount(reversedNumber);
    int numberDigits = getDigitCount(number);
    
    while (true) {
      switch (reversedNumber % 10) {
        case 0 -> System.out.println("Zero");
        case 1 -> System.out.println("One");
        case 2 -> System.out.println("Two");
        case 3 -> System.out.println("Three");
        case 4 -> System.out.println("Four");
        case 5 -> System.out.println("Five");
        case 6 -> System.out.println("Six");
        case 7 -> System.out.println("Seven");
        case 8 -> System.out.println("Eight");
        case 9 -> System.out.println("Nine");
        default -> System.out.println("Invalid value");
      }
      reversedNumber /= 10;
      
      if (reversedNumber == 0) break;
    }
    
    if (reversedNumberDigits != numberDigits) {
      for (int i = 0; i < numberDigits - reversedNumberDigits; i++) {
        System.out.println("Zero");
      }
    }
  }
  
}
