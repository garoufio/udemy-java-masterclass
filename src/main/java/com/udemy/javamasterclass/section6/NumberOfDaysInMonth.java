package com.udemy.javamasterclass.section6;

import com.udemy.javamasterclass.section5.LeapYear;

public class NumberOfDaysInMonth {
  
  public static int getDaysInMonth(int month, int year) {
    if (month < 1 || month > 12) return -1;
    if (year < 1 || year > 9999) return -1;
    
    return switch(month) {
      case 1 -> DaysInMonth.JANUARY.getValue();
      case 2 -> LeapYear.isLeapYear(year) ? DaysInMonth.FEBRUARY_LEAP_YEAR.getValue() : DaysInMonth.FEBRUARY.getValue();
      case 3 -> DaysInMonth.MARCH.getValue();
      case 4 -> DaysInMonth.APRIL.getValue();
      case 5 -> DaysInMonth.MAY.getValue();
      case 6 -> DaysInMonth.JUNE.getValue();
      case 7 -> DaysInMonth.JULY.getValue();
      case 8 -> DaysInMonth.AUGUST.getValue();
      case 9 -> DaysInMonth.SEPTEMBER.getValue();
      case 10 -> DaysInMonth.OCTOBER.getValue();
      case 11 -> DaysInMonth.NOVEMBER.getValue();
      case 12 -> DaysInMonth.DECEMBER.getValue();
      default -> -1;
    };
  }

}