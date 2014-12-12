package com.github.stadler.properties.jodabeans;

import java.util.logging.Logger;

import org.junit.Test;



public class PersonTest {

  @Test
  public void testJodaBeansPerson() {
    Person person = Person.builder().age(20).firstName("hans").middleName("A", "B").lastName("wurst").build();
    Person person2 = Person.builder().age(20).firstName("hans").middleName("A", "B").lastName("wurst").build();
    
    Logger.getGlobal().info(person.getFirstName());
    Logger.getGlobal().info(person.getLastName());
    Logger.getGlobal().info(String.valueOf(person.getAge()));
    Logger.getGlobal().info(person.fullName());
    Logger.getGlobal().info(person.toString());
    
    if (person.equals(person2)) {
      Logger.getGlobal().info("Persons are equal");
    } else {
      Logger.getGlobal().info("Persons are NOT equal");
    }
  }

}
