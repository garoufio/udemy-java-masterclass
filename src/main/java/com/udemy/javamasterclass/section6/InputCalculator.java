package com.udemy.javamasterclass.section6;

import java.util.Scanner;

public class InputCalculator {
  
  public static void inputThenPrintSumAndAverage() {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    long avg;
    
    
    while (true) {
      if (input.hasNextInt()) {
        sum += input.nextInt();
        count++;
        input.nextLine();
      }
      else {
        break;
      }
    }
    input.close();
    
    avg = (count == 0) ? 0 : Math.round((double)sum / count);
    System.out.printf("SUM = %d AVG = %d\n", sum, avg);
  }
  
}
