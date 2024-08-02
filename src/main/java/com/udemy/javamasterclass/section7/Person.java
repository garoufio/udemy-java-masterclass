package com.udemy.javamasterclass.section7;

public class Person {
  
  private String firstName;
  private String lastName;
  private int age;
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public String getFirstName() {
    return firstName;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public String getLastName() {
    return lastName;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public int getAge() {
    return age;
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public void setAge(int age) {
    this.age = (age < 0 || age > 100 ? 0 : age);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public boolean isTeen() {
    return (age > 12 && age < 20);
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
  public String getFullName() {
    boolean isFirstNameEmpty = (firstName == null || firstName.isEmpty());
    boolean isLastNameEmpty = (lastName == null || lastName.isEmpty());
    
    if (isFirstNameEmpty && isLastNameEmpty) {
      return "";
    }
    else if (isFirstNameEmpty) {
      return lastName;
    }
    else if (isLastNameEmpty) {
      return firstName;
    }
    else {
      return firstName + " " + lastName;
    }
  }
  
  //-------------------------------------------------------------------------------------------------------------------
  
}