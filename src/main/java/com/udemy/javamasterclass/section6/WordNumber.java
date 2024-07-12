package com.udemy.javamasterclass.section6;

public enum WordNumber {
  ZERO("ZERO"),
  ONE("ONE"),
  TWO("TWO"),
  THREE("THREE"),
  FOUR("FOUR"),
  FIVE("FIVE"),
  SIX("SIX"),
  SEVEN("SEVEN"),
  EIGHT("EIGHT"),
  NINE("NINE");
  
  private String value;
  
  private WordNumber(String value) {
    this.value = value;
  }
}
