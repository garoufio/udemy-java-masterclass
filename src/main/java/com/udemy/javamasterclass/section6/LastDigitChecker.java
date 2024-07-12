package com.udemy.javamasterclass.section6;

public class LastDigitChecker {
  
  public static boolean isValid(int number) {
    return (number >= 10 && number <= 1000);
  }
  
  public static boolean hasSameLastDigit(int number1, int number2, int number3) {
    if (!isValid(number1) || !isValid(number2) || !isValid(number3)) return false;
    
    int number1RightmostDigit = number1 % 10;
    int number2RightmostDigit = number2 % 10;
    int number3RightmostDigit = number3 % 10;

    return (number1RightmostDigit == number2RightmostDigit ||
        number1RightmostDigit == number3RightmostDigit ||
        number2RightmostDigit == number3RightmostDigit);
  }
  
}
