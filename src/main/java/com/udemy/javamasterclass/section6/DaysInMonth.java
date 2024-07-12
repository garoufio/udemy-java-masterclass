package com.udemy.javamasterclass.section6;

public enum DaysInMonth {
  JANUARY(31),
  FEBRUARY(28),
  FEBRUARY_LEAP_YEAR(29),
  MARCH(31),
  APRIL(30),
  MAY(31),
  JUNE(30),
  JULY(31),
  AUGUST(31),
  SEPTEMBER(30),
  OCTOBER(31),
  NOVEMBER(30),
  DECEMBER(31);
  private int days;
  
  private DaysInMonth(int days) {
    this.days = days;
  }
  
  public int getValue() {
    return days;
  }
  
}
