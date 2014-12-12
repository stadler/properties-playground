package com.github.stadler.properties.autovalue;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.logging.Logger;

import org.junit.Test;



public class PersonTest {

  @Test
  public void testPerson() {
    Person person = Person.create("hans", Arrays.asList("A", "B"), "wurst", 20);
    Person person2 = Person.create("hans", new LinkedList<String>(), "wurst", 20);
    
    Logger.getGlobal().info(person.firstName());
    Logger.getGlobal().info(person.lastName());
    Logger.getGlobal().info(String.valueOf(person.age()));
    Logger.getGlobal().info(person.fullName());
    Logger.getGlobal().info(person.toString());
    
    if (person.equals(person2)) {
      Logger.getGlobal().info("Persons are equal");
    } else {
      Logger.getGlobal().info("Persons are NOT equal");
    }
    
    
  }

}
