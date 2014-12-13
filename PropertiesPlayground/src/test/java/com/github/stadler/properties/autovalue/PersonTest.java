package com.github.stadler.properties.autovalue;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.github.stadler.properties.TestValues;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonTest {

  @Test
  public void testPerson() {
    Person person = Person.create("hans", Arrays.asList("A", "B"), "wurst", 20);
    Person person2 = Person.create("hans", Arrays.asList("A", "B"), "wurst", 20);

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

  @Test
  public void speedTest() {
    List<String> results = new ArrayList<>(TestValues.iterations);
    Instant before = Instant.now();
    for (int i = 0; i < TestValues.iterations; i++) {
      results.add(createPerson().toString());
    }
    Logger.getGlobal().info("Time needed: " + Duration.between(before, Instant.now()));
    Logger.getGlobal().info(results.get(TestValues.randomInt()));
  }

  private Person createPerson() {
    return Person.create("hans", Arrays.asList("A", TestValues.testString()), "wurst", 20);
  }

}
