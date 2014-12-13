package com.github.stadler.properties;

import java.util.Random;

public final class TestValues {

  public static int iterations = 1_000_000;

  private static Random random = new Random();

  public static String testString() {
    return String.valueOf(random.nextBoolean());
  }
  
  public static int randomInt() {
    return random.nextInt(iterations);
  }
}
