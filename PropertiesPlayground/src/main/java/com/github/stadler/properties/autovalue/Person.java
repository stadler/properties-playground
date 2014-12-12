package com.github.stadler.properties.autovalue;

import java.util.List;

import javax.annotation.Nullable;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class Person {
  
  public static Person create(String firstName, List<String> middleName, String lastName, int age) {
    return new AutoValue_Person( firstName, middleName, lastName,  age);
  }
  
  public abstract String firstName();
  
  @Nullable
  public abstract List<String> middleName();
  
  public abstract String lastName();
  
  public abstract int age();
  
  public String fullName() {
    return this.firstName() + " " + this.lastName();
  }
  
  

}
