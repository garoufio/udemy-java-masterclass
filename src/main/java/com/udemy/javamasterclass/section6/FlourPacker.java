package com.udemy.javamasterclass.section6;

public class FlourPacker {
  
  public static final int BIG_BAG_KG = 5;
  public static final int SMALL_BAG_KG = 1;
  
  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if (bigCount < 0 || smallCount < 0 || goal < 0) return false;
    
    if (((bigCount * BIG_BAG_KG) + (smallCount * SMALL_BAG_KG)) < goal) {
      return false;
    }
    
    if ((bigCount * BIG_BAG_KG) > goal) {
      if (smallCount == 0) {
        return false;
      }
      
      int count = bigCount - 1;
      while (count > 0) {
        if (count * BIG_BAG_KG <= goal && ((count * BIG_BAG_KG) + (smallCount * SMALL_BAG_KG) >= goal)) {
          return true;
        }
        count--;
      }
      return false;
    }
    
    return true;
  }
  
}