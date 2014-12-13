package com.github.stadler.properties.lombok;

import java.util.Arrays;
import java.util.logging.Logger;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonTest {

  @Test
  public void testPerson() {
    Person person = new Person("hans", Arrays.asList("A", "B"), "wurst", 20);
    Person person2 = new Person("hans", Arrays.asList("A", "B"), "wurst", 20);

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
