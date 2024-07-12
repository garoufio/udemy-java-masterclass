package com.udemy.javamasterclass.section6;

public class NumberInWord {
  
  public static void printNumberInWord(int number) {
    switch (number) {
      case 0 -> System.out.println(WordNumber.ZERO);//("ZERO");
      case 1 -> System.out.println(WordNumber.ONE);//("ONE");
      case 2 -> System.out.println(WordNumber.TWO);//("TWO");
      case 3 -> System.out.println(WordNumber.THREE);//("THREE");
      case 4 -> System.out.println(WordNumber.FOUR);//("FOUR");
      case 5 -> System.out.println(WordNumber.FIVE);//("FIVE");
      case 6 -> System.out.println(WordNumber.SIX);//("SIX");
      case 7 -> System.out.println(WordNumber.SEVEN);//("SEVEN");
      case 8 -> System.out.println(WordNumber.EIGHT);//("EIGHT");
      case 9 -> System.out.println(WordNumber.NINE);//("NINE");
      default -> System.out.println("OTHER");
    }
  }

}
