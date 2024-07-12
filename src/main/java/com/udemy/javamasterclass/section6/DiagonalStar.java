package com.udemy.javamasterclass.section6;

public class DiagonalStar {
  
  public static final String STAR = "*";
  public static final String SPACE = " ";
  
  public static void printSquareStar(int number) {
    if (number < 5) {
      System.out.println("Invalid Value");
      return;
    }
    
    boolean canPrint;
    for (int i = 0; i < number; i++) {
      canPrint = ((i == 0) || (i == number - 1));
      for (int j = 0; j < number; j++) {
        if (canPrint) {
          System.out.print(STAR);
        }
        else if ((j == 0) || (j == number - 1) || (i == j)) {
          System.out.print(STAR);
        }
        else if (j == (number - (i + 1))) {
          System.out.print(STAR);
        }
        else {
          System.out.print(SPACE);
        }
      }
      System.out.println();
    }
  }

}
