package com.udemy.javamasterclass.setction5;

public class PositiveNegativeOrZero {
  
  public static void checkNumber(int number) {
    if (number > 0) {
      System.out.println("positive");
    }
    else if (number < 0) {
      System.out.println("negative");
    }
    else {
      System.out.println("zero");
    }
  }
  
}
