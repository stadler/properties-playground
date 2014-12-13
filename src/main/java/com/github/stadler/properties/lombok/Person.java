package com.github.stadler.properties.lombok;

import java.util.List;

import javax.annotation.Nullable;

import lombok.Value;

@Value
public class Person {
  
  String firstName;
  
  @Nullable
  List<String> middleName;
  
  String lastName;
  
  int age;
  
  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

}
